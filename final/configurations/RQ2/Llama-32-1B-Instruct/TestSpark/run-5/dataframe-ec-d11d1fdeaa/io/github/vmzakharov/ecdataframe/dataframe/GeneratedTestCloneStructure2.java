package io.github.vmzakharov.ecdataframe.dataframe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class GeneratedTestCloneStructure2 {

    public static void main(String[] args) {
        // Create test data
        List<String> table1 = Arrays.asList("A", "B", "C");
        List<String> table2 = Arrays.asList("X", "Y");

        // Join the tables
        DataFrame resultJoin = join(table1, "A", table2);

        System.out.println(resultJoin);
    }

    public static DataFrame join(List<String> table1, String thisKey, List<String> table2) {
        return null;
    }

    @Test
    public void testCloneStructure2() {
        // Create a sample DataFrame
        List<String> table = Arrays.asList("X", "Y");

        // Clone the second column and get the sub-DataFrame
        Map<String, Set<String>> clonedResult = cloneStructure(table, 1);

        System.out.println(clonedResult);
    }

}