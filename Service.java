package MySuperArray;


import java.util.Arrays;

public class Service implements MySuperArray {
    int[] myArray;
    int newElement;

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    @Override
    public  int getLength() {
        return myArray.length;
    }

    @Override
    public void addElement(int newElement) {
        int [] newArray = Arrays.copyOf(myArray, myArray.length + 1);
        newArray[myArray.length] = Integer.parseInt(String.valueOf(newElement));
        System.out.println(newArray);
    }

    @Override
    public Object getElement(int index) {
        for (int i = 0; i < myArray.length; i++) {
            if (i == index) {
                return myArray[i];
            }
        }
        return index;
    }

    @Override
    public void removeAllElements() {
        this.myArray = new int[0];
    }

    @Override
    public Object[] getAllElements() {
        return new Object[]{this.myArray};
    }

}


