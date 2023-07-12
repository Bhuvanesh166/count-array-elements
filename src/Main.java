import java.util.Scanner;

class CountArray{
         public int greaterCount(int[] number){
             int max=Integer.MIN_VALUE;
             int count=0;
             for(int i=0;i<number.length;i++){
                 if(max<number[i]){
                     max=number[i];
                 }

             }

             for(int i=0;i<number.length;i++){
                 if(max==number[i]){
                     count++;

                 }

             }
              return number.length-count;

         }

    public static void main(String[] args) {
        CountArray countArray=new CountArray();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(countArray.greaterCount(arr));
    }
}
