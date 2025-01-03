package prc;

public class merge {
    

public static void printarr(int arr[]) {
         for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
}

    public static void mergesort(int arr[],int si ,int ei){
            //base case
            if (si>=ei) {
                return;
            }

            // find mid
            int mid = si + (ei-si)/2;
            mergesort(arr, si, mid);//left part
            mergesort(arr, mid+1, ei);// right part

            merging(arr, si, mid, ei);
    }



    // for merging array
    public static void merging(int arr[],int si , int mid,int ei) {
            int temp[] = new int[ei-si+1];
            int i = si;// iterator for left part
            int j =mid+1;//iterator for right part
            int k = 0;

            while (i <= mid && j <= ei) { 
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                    
                }else{
                    temp[k] = arr[j];
                    j++;
                
                }
                k++;
    }
        // for remaining left part
            while (i <=mid ) { 
                temp [k++]= arr[i++];
            }
        // for remaining right part
            while (j <=ei ) { 
                temp [k++]= arr[j++];
            }
        // copy temp to original array
            for(k=0, i=si; k<temp.length; k++,i++){
                arr[i]= temp[k];
            }
}
        public static void main(String[] args) {
    int arr[] = {6,3,9,5,2,8};
    mergesort(arr, 0, arr.length-1);
    printarr(arr);

 }

}
