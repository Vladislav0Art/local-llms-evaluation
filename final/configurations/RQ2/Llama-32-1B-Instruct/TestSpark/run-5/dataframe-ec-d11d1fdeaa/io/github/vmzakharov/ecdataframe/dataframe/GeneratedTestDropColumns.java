package io.github.vmzakharov.ecdataframe.dataframe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class GeneratedTestDropColumns {

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
    public void testDropColumns() {
        // Create a sample DataFrame
        List<String> table = Arrays.asList("X", "Y");

        // Drop columns X and Y
        Map<String, Set<String>> dropResult = new HashMap<>();
        for (String row : table) {
            if (!row.equals("X") && !row.equals("Y")) {
                dropResult.put(row, new HashSet<>(Arrays.asList("A", "B")));
            }
        }

        System.out.println(dropResult);
    }

}