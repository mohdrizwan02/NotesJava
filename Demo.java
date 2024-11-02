
import java.util.Arrays;

class Demo{
    public void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int partition(int[] nums ,int low,int high){
        int pivot = nums[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
               i++;
               swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }
    public void quickSort(int nums[],int low,int high){
        int pivot=partition(nums,low,high);
        if(low<high){
            quickSort(nums,low,pivot-1);
            quickSort(nums,pivot+1,high);

        }
    }
    public static void main(String[] args) {
        int nums[] = {5,3,8,6,0,2,4,7};
        Demo d = new Demo();
        d.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}

