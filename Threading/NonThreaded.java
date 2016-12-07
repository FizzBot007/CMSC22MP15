public class NonThreaded{
  private int size;
  private int[][] arr;
 
 public NonThreaded(int size){
   arr = new int[size][size];
   this.size = size;
 }
 
 public void init(){
   for(int i = 0; i < size; i++)
     for(int j = 0; j < size; j++)
     arr[i][j] = 0;
   
  arr[0][size/2] = 1; 
 }
  
 public void ruleImplement(){
   for(int i = 0; i < size ; i++){
            for(int j = 0; j < size ; j++){
                
            if(j == 0){
                if(arr[i][j] == 0 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j] == 0 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j] == 1 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j] == 1 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 1;
            }
            else if(j == size - 1){
                if(arr[i][j-1] == 0 && arr[i][j] == 0 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j-1] == 0 && arr[i][j] == 1 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j-1] == 1 && arr[i][j] == 0 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j-1] == 1 && arr[i][j] == 1 && i + 1 < size)
                    arr[i+1][j] = 0;
            }
            else if(j != 0){
                if(arr[i][j-1] == 0 && arr[i][j] == 0 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j-1] == 1 && arr[i][j] == 1 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j-1] == 1 && arr[i][j] == 1 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j-1] == 1 && arr[i][j] == 0 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 0;
                if(arr[i][j-1] == 1 && arr[i][j] == 0 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j-1] == 0 && arr[i][j] == 1 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j-1] == 0 && arr[i][j] == 1 && arr[i][j+1] == 0 && i + 1 < size)
                    arr[i+1][j] = 1;
                if(arr[i][j-1] == 0 && arr[i][j] == 0 && arr[i][j+1] == 1 && i + 1 < size)
                    arr[i+1][j] = 1;
            }
            }
        }
   
 }
 
 public void print(){
  init();
  ruleImplement();
         for(int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.printf("%s",arr[i][j]);
            }
            System.out.println();
        }
 }
  
}