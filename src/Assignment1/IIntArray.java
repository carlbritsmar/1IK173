package Assignment1;
public interface IIntArray{
    //get the average value of entire array
    //@return average

    double getAverage() throws Exception;
    //* Find and return all positions where an element's value is <val>.
    //@param val Value to find positions for.
    //@return Positions

    int [] findPositions(int val);
    //append a value after the last element
    //param element

    void appendLast(int value);
    //insert a value at postiion <pos>
    //@param pos
    //@param value

    void insertAt(int pos, int value);
    //get value at position <pos>
    //@param pos
    //@return value

    int getAt(int pos);
    //set a new value at position <pos>
    //@param pos
    //@param element

    void setAt(int pos, int element);
    //delete element at position <pos>
    //return the deleted elements value
    //@param pos
    //@return

    int deleteAt(int pos);
}