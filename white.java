public class tstsrt {
    public int[] calci(int arr[]) {

        for(int i= 0 ; i<arr.length ; i++) {
            int min = i;

            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        // print arr
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }
    public boolean tester(int arr[] , int chk[]){
        if(arr.length != chk.length) {
            return false;
        }
        else{
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != chk[i]) {
                    return false;
                }
            }
        }
        return true;
        }

        public static void main(String[] args){
            tstsrt obj = new tstsrt();
            int arr[] = {3,4,5,6,7,8,9,10,1,2};
            int chk[] = {1,2,3,4,5,6,7,8,9,10};
            int res[] = obj.calci(arr);
            boolean test = obj.tester(res, chk);
            System.out.println(test);
        }
}