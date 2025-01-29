package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSort {

    @Test
    public void testSort() {
        // Test sorting by a column in ascending order
        DataFrame df = new DataFrame("ColumnA", "ColumnB");

        String[] sortOrders = {"asc"};
        DfColumnSortOrder sortOrder1 = new DfColumnSortOrder(sortOrders[0], "asc");
        DfColumnSortOrder sortOrder2 = new DfColumnSortOrder(sortOrders[1], "desc");

        DataFrame sortedDF = df.sort(sortOrder1);
        assertEquals("ColumnA", sortedDF.getColumn("Column1"));
        assertEquals("ColumnB", sortedDF.getColumn("Column2"));

        sortedDF = df.sort(sortOrder2);
        assertEquals(null, sortedDF.getColumn("Column1"));
        assertEquals("ColumnB", sortedDF.getColumn("Column2"));
    }

}