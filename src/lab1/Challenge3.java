package lab1;


public class Challenge3 {
    static int Pair2(int[] a, int ind) {
        int val = 0;
        int[] arr = new int[10];
        for (int i = 0; i < ind; i++)
            arr[i] = 0;


        for (int i = 0; i < ind; i++) {
            if(a[i]<0){
                if(arr[-a[i]]>0){
                    val++;
                }
                arr[-a[i]]--;
            }
            else if(a[i]>0){
                if(arr[a[i]]<0)
                    val++;
                arr[a[i]]++;

            }
            else {
                if(arr[0]==1){
                    val++;
                    arr[0]=0;
                }
                else arr[0]=1;
            }
        }


        return val;
    }

    public static void main(String[] args) {
        int[] arr={5,9,-5,7,5};
        int val;
        val=Pair2(arr,5);
        System.out.print(val);
    }

}
