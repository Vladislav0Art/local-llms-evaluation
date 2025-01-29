package io.github.vmzakharov.ecdataframe.dataframe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class GeneratedTestPartition {

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
    public void testPartition() {
        // Create a sample DataFrame
        List<String> table = Arrays.asList("X", "Y");

        // Partition the first column and get the sub-DataFrame
        Map<String, Set<String>> partitionedResult = partition(table, "A");

        System.out.println(partitionedResult);
    }

}