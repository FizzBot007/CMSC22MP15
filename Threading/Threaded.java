public class Threaded {
 private int size;
 private int[][] arr;
 private int toThread;
 private static int threshold = 10;
 private int half;
 private int toDo;
 private int start;
 
 
 public Threaded(int size){
   arr = new int[size][size];
   this.size = size;
 }
 
 public void init(){
     for(int j = 0; j < size; j++){
       if(j == size/2){
         arr[0][j] = 1;
       }else
     arr[0][j] = 0;
     System.out.print(arr[0][j]);
   }
 
  System.out.println();
 }
  
 public void print(){
  init();
  if(size < threshold)
    toThread = size;
  else
    toThread = threshold;
  ThreadImplement t[] = new ThreadImplement[toThread];
  half = size / toThread;
  toDo = size % toThread;
  
  for(int i = 0; i < size - 1; i++){
    start = 0;
    for(int j = 0; j < toThread; j++){
      if(j < toDo){
       t[j] = new ThreadImplement(arr, start, half + 1, i); 
      }
      else{
       t[j] = new ThreadImplement(arr, start, half, i);
      }
      if(j < toDo){
       start += half + 1; 
      }
      else{
       start += half; 
      }
      t[j].start();
      while(t[j].isAlive()){
        try{
          t[j].join();
        }catch(InterruptedException e){
        System.err.println("Thread Interrupted");
        }
      }
    }
    for(int j = 0, k = 0; j < t.length; j++){
      for(int x: t[j].arr2){
       arr[i + 1][k] = x;
       System.out.printf("%s", x);
       k++;
      }
    }
    System.out.println();
  }
  
  
 }
  
}