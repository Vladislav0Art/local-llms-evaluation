package io.github.vmzakharov.ecdataframe.dataframe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class GeneratedTestJoin {

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
    public void testJoin() {
        // Create a sample DataFrame
        Map<String, Set<String>> table1 = new HashMap<>();
        table1.put("A", new HashSet<>(Arrays.asList("X", "Y")));
        table1.put("B", new HashSet<>(Arrays.asList("Z", "W")));

        Map<String, Set<String>> table2 = new HashMap<>();
        table2.put("X", new HashSet<>(Arrays.asList("A", "C")));
        table2.put("Y", new HashSet<>(Arrays.asList("A", "D")));

        // Join the tables
        DataFrame resultJoin = join(table1, "A", table2);

        System.out.println(resultJoin);
    }

}