package Z1;

import java.util.ArrayList;

public class ArrayUtil {
    public static<T extends Comparable<T>> boolean jestPalindromem(ArrayList<T> array) {
        int k = 0;
        int j = array.size() - 1;
        for(int i = 0; i<array.size(); i++) {
            if(array.get(i).compareTo(array.get(j)) == 0) {
                k++;
            }
            j--;
        }
        if(k == array.size()) {
            return true;

        }
        else {
            return false;
        }
    }
}
