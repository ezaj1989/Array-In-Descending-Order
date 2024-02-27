// this is the Deletion of element in array.
public class DeletionOfElementInArray {
    public static void main(String[] args) {
        int i;
        int[] A=new int[5];
        A[0]=10;A[1]=5;A[2]=98;A[3]=80;A[4]=100;
        int n=6;
        System.out.println("Displaying the array element: ");
        for(i=0;i<n-1;i++){
            System.out.print(A[i]+",");
        }
        int det_Ele=98;
        for(i=0;i<A.length;i++){
            if(det_Ele==A[i]){
                for(int j=i;j<A.length-1;j++){
                    A[i]=A[j+1];
                }
                break;
            }
        }
        System.out.println("\nDisplaying the array element after Deletion: ");
        for(i=0;i<A.length-1;i++){
            System.out.print(A[i]+",");
        }

    }
}
