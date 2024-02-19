import java.util.Arrays;

public class App implements IIntArray{
    
    int [] appArray;

    @Override
   public double getAverage(){
    if(appArray == null || appArray.length == 0){
        return 0.0;
    }
    int sum = 0;
    for (int i = 0; i < appArray.length; i++){
        sum += appArray[i];
    }
        return (double)sum/appArray.length;
    }
    
    @Override
    public int[] findPositions(int val){
    int occurrencesOfValue = 0;
    for (int i = 0; i < appArray.length; i++){
        if ( val == appArray[i]){
            occurrencesOfValue++;
        }

    }int [] indexOf = new int[occurrencesOfValue];
     int index = 0;
        for (int i = 0; i < appArray.length; i++){
            if (val == appArray[i]){
                indexOf[index] = i;
                index++;
                }
        }   
        return indexOf;
    }

    @Override
    public void appendLast(int value){
      int [] appendArray = Arrays.copyOf(appArray, appArray.length + 1);
      appendArray [appendArray.length - 1] = value;
      appArray = appendArray;
      }

      @Override
      public void insertAt(int pos, int value){
        if(pos < 0 || pos > appArray.length){
            throw new IndexOutOfBoundsException();
        }
          int [] insertAtArray = new int[appArray.length + 1];
          for (int i = 0; i < appArray.length; i++){
              if(i < pos){
                  insertAtArray[i] = appArray[i];
              } else if (i == pos){
                  insertAtArray[i] = value;
                  insertAtArray[i + 1] = appArray[i];
              } else {
                  insertAtArray[i + 1] = appArray[i];
              }
          }
          if (pos == appArray.length) {
              insertAtArray[pos] = value;
          }
          appArray = insertAtArray;
      }
    @Override
    public int getAt(int pos){
        if (pos < 0 || pos > appArray.length){
            throw new IndexOutOfBoundsException();
        }
        return appArray[pos];
        
    }

    @Override
    public void setAt(int pos, int element){
        int [] setAtArray = new int[appArray.length];
        for (int i = 0; i < appArray.length; i++){
            if (i < pos - 1){
                setAtArray[i] = appArray[i];
            }else if (i == pos ){
                setAtArray[i] = pos; 
            }else{
                setAtArray[i] = appArray[i - 1];
            }
        }
    }
@Override
public int deleteAt(int pos){
    int value = appArray[pos];
    int[] deleteArray = new int[appArray.length - 1];

    for (int i = 0, j = 0; i < appArray.length; i++){
        if (i != pos){
            deleteArray[j] = appArray[i];
            j++;
        }
    }

    appArray = deleteArray;
    return value;
}
}