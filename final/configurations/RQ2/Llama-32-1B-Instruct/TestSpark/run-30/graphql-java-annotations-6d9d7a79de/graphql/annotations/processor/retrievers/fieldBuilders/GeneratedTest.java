package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    public static int checkEqual(int[] array1, int[] array2) {
        for (int i : array1) {
            if (i != array2[i]) {
                return 0;
            }
        }
        return 1;
    }

}