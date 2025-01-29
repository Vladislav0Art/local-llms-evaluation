package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testCreateDataFrame() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
    }

    @Test
    public void testAddColumn() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.addColumn("new_column", null, String.class);
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
        assertEquals("new_column", df.getColumns().get(1));
    }

    @Test
    public void testRemoveColumn() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.removeColumn("column1");
        assertEquals("test", df.getId());
        assertEquals("column2", df.getColumnNames().get(0));
    }

    @Test
    public void testRenameColumn() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.renameColumn("new_column", "old_column_name");
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("new_column", df.getColumns().get(1));
    }

    @Test
    public void testSortBy() {
        DataFrame df = new DataFrame("test", "column1", "column2");
        df.sortBy("column1");
        assertEquals("test", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("column2", df.getColumnNames().get(1));
    }

    @Test
    public void testJoin() {
        DataFrame df1 = new DataFrame("df1", "column1", "column2");
        DataFrame df2 = new DataFrame("df2", "column3", "column4");

        String[] joinColumns = {"column1", "column3"};
        int joinIndex = 0;
        String otherJoinColumnName = "other_column_name";
        DfJoin joinDescriptor = new DfJoin(df1, joinColumns, joinIndex, otherJoinColumnName);

        DataFrame df = join(df1, joinDescriptor);
        assertEquals("df2", df.getId());
        assertEquals("column1", df.getColumnNames().get(0));
        assertEquals("other_column_name", df.getColumns().get(1));

        String[] otherJoinColumns = {"column3"};
        joinDescriptor = new DfJoin(df2, otherJoinColumns, 0, "other_join_column_name");
        df = join(df2, joinDescriptor);
        assertEquals("df1", df.getId());
        assertEquals("column4", df.getColumnNames().get(0));
    }

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