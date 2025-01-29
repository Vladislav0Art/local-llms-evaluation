package graphql.annotations.processor.retrievers.fieldBuilders;

import com.google.common.base.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestDirectives {

    private static final int[] array1 = {10, 20, 30};
    private static final int[] array2 = {40, 50, 60};

    @BeforeClass
    public static void runTest() {
        Preconditions.checkArgument(array1.length == array2.length);
    }

    @Test
    public void testDirectives() {
        for (int i : array1) {
            assert i > 0;
        }
    }

}