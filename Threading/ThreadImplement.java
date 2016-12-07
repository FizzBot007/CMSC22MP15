public class ThreadImplement extends Thread{
  private int[] arr1;
  public int[] arr2;
  private int start;
  private int stop;
  private int row;

  public ThreadImplement(int[][] arr, int start, int stop, int row){
    arr1 = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      arr1[i] = arr[row][i];
    }
      
   this.arr2 = new int[stop]; 
   this.start = start;
   this.stop = stop;
   this.row = row; 
  }

  public void ruleImplement(){
            for(int j = 0; j < stop ; j++){
            if(j + start == 0){
                if(arr1[j + start] == 0 && arr1[j + start + 1] == 0)
                    arr2[j] = 0;
                if(arr1[j+start] == 0 && arr1[j+start+1] == 1)
                    arr2[j] = 1;
                if(arr1[j+start] == 1 && arr1[j+start+1] == 1)
                    arr2[j] = 1;
                if(arr1[j+start] == 1 && arr1[j+start+1] == 0)
                    arr2[j] = 1;
            }
            else if(j + start == arr1.length - 1){
                if(arr1[j+start-1] == 0 && arr1[j+start] == 0)
                    arr2[j] = 0;
                if(arr1[j+start-1] == 0 && arr1[j+start] == 1)
                    arr2[j] = 1;
                if(arr1[j+start-1] == 1 && arr1[j+start] == 0)
                    arr2[j] = 1;
                if(arr1[j+start-1] == 1 && arr1[j+start] == 1)
                    arr2[j] = 0;
            }
            else if(j + start != 0){
                if(arr1[j+start-1] == 0 && arr1[j+start] == 0 && arr1[j+start+1] == 0)
                    arr2[j] = 0;
                if(arr1[j+start-1] == 1 && arr1[j+start] == 1 && arr1[j+start+1] == 1)
                    arr2[j] = 0;
                if(arr1[j+start-1] == 1 && arr1[j+start] == 1 && arr1[j+start+1] == 0)
                    arr2[j] = 0;
                if(arr1[j+start-1] == 1 && arr1[j+start] == 0 && arr1[j+start+1] == 1)
                    arr2[j] = 0;
                if(arr1[j + start - 1] == 1 && arr1[j + start] == 0 && arr1[j+start+1] == 0)
                    arr2[j] = 1;
                if(arr1[j + start -1] == 0 && arr1[j + start] == 1 && arr1[j + start + 1] == 1)
                    arr2[j] = 1;
                if(arr1[j + start -1] == 0 && arr1[j + start] == 1 && arr1[j + start + 1] == 0)
                    arr2[j] = 1;
                if(arr1[j + start -1] == 0 && arr1[j + start] == 0 && arr1[j+ start +1] == 1)
                    arr2[j] = 1;
            }
            }
        }
  
  
 public void run(){
  ruleImplement(); 
 }
}

