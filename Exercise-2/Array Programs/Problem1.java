package Array_Programs;

//Find maximum number from array

public class Problem1 {
    public static int getLargest(int[] a,int total){
        int temp;

        for (int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return  a[total-1];
    }

    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        int b[]={43,44,95,77,33,278,55};
        System.out.println("Largest: "+getLargest(a,6));
        System.out.println("Largest: "+getLargest(b,7));
    }
}
