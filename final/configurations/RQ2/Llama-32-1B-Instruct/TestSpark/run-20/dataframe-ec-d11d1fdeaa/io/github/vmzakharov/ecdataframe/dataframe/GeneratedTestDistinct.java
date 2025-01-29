package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDistinct {

    @Test
    public void testDistinct() {
        DataFrame df = new DataFrame("test", "column1", "column2");

        List<String> columnNamesToKeep = Arrays.asList("column1");
        DfCellComparator comparator = new DfCellComparator();

        DataFrame dfKeep = df.distinct(columnNamesToKeep, null);
        assertEquals("test", dfKeep.getId());
        assertEquals(Arrays.asList("column1"), dfKeep.getColumnNames().stream().sorted(comparator).distinct().toArray(String[]::new));
    }

}