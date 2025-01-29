package io.github.vmzakharov.ecdataframe.dataframe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class GeneratedTestCloneStructure4 {

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
    public void testCloneStructure4() {
        // Create a sample DataFrame
        List<String> table = Arrays.asList("X", "Y");

        // Clone the fourth column and get the sub-DataFrame
        Map<String, Set<String>> clonedResult = cloneStructure(table, 3);

        System.out.println(clonedResult);
    }

    private static DataFrame cloneStructure(List<String> table, int columnIndex) {
        Map<String, Set<String>> result = new HashMap<>();
        for (String row : table) {
            if (!row.equals("X") && !row.equals("Y")) {
                result.put(row, new HashSet<>(Arrays.asList(columnIndex + 1)));
            }
        }

        return result;
    }

    private static DataFrame join(List<String> table1, String thisKey, List<String> table2) {
        Map<String, Set<String>> mapTable1 = new HashMap<>();
        for (String row : table1) {
            if (!row.equals(thisKey)) {
                mapTable1.put(row, new HashSet<>(Arrays.asList("A")));
            }
        }

        Map<String, Set<String>> mapTable2 = new HashMap<>();
        for (String row : table2) {
            if (!row.equals(thisKey)) {
                mapTable2.put(row, new HashSet<>(Arrays.asList("B")));
            }
        }

        List<Set<String>> values1 = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : mapTable1.entrySet()) {
            values1.add(entry.getValue());
        }

        List<Set<String>> values2 = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : mapTable2.entrySet()) {
            values2.add(entry.getValue());
        }

        Set<String> intersection = new HashSet<>(values1.stream().flatMap(v -> v).toArray(String[]::new));
        Set<String> union = new HashSet<>(values1.stream().flatMap(v -> v).union(values2.stream().flatMap(v -> v).toArray(String[]::new)));

        return mapTable1.entrySet().stream()
                .map(entry -> {
                    String key = entry.getKey();
                    Set<String> value = entry.getValue();
                    if (value.contains(thisKey)) {
                        return new AbstractMap.SimpleEntry<>(key, union);
                    } else {
                        return new AbstractMap.SimpleEntry<>(key, intersection);
                    }
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static DataFrame partition(List<String> table, String key) {
        // This method should be implemented to split the data into two sub-DataFrames
        // based on a specific column and get back their intersection
        return null;
    }

}