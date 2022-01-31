import java.util.ArrayList;

public class GameDeckBag<T> implements BagInterface<T> {

    public  T[] arrayList;
    public int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 52;
    private boolean intitialised = false;
    private static final int MAX_CAPACITY = 52;

    private boolean isArrayFull() {
        return (arrayList.length == numberOfEntries);
    }

    private void checkInitialisation() {
        if (!intitialised)
            throw new SecurityException("GameDeckBag is no intialised properly");
    }

    public T removeElementAt (int index) {
        T result = null;
        if(!isEmpty() && index >= 0 && index < numberOfEntries) {
            result = arrayList[index];
            arrayList[index] = arrayList[numberOfEntries -1];
            arrayList[numberOfEntries -1] = null;
            numberOfEntries--;
        }
        return result;
    }

    public GameDeckBag() {
        this(DEFAULT_CAPACITY);
    }

    public GameDeckBag(int capacity) {
        if (capacity <= 52) {
            T[] tempBag = (T[]) new Card[capacity];
            arrayList = tempBag;
            numberOfEntries = 0;
            intitialised = true;
        } else throw new IllegalStateException("Attempt to create a new deck where capacity exceeds max");
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public boolean isEmpty() {
        return (numberOfEntries == 0);
    }

    public boolean addNewEntry(T newEntry) {
        checkInitialisation();
        if (isArrayFull()) return false;
        else{
            arrayList[numberOfEntries++] = newEntry;
            return true;
        }
    }

    public T remove() {
        checkInitialisation();
        return removeElementAt(numberOfEntries - 1);
    }

    public boolean remove(T anEntry) {
         boolean found = false;
         int index = 0;
         while (!found && index < numberOfEntries)
             if (arrayList[index].equals(anEntry)) found = true;
             else index++;
         if (found) removeElementAt(index);
         return found;
    }

    public void clear() {
        while(!isEmpty()) remove();
    }

    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for (int i = 0; i < numberOfEntries; i++)
            if (arrayList[i].equals(anEntry)) count++;
        return count;
    }

    public boolean contains(T anEntry) {
        boolean found = false;
        int index = 0;
        while (!found && index < numberOfEntries)
            if (arrayList[index].equals(anEntry)) found = true;
        return found;
    }

    public T[] toArray() {
        T[] resultArray = (T[]) new Card[numberOfEntries];
        System.arraycopy(arrayList, 0, resultArray, 0, numberOfEntries);
        return resultArray;
    }
}
