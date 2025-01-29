package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTest {

    @Test
    public void testGetValues() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new int[]{1, 2, 3});
        df.insertRow(1, new int[]{4, 5, 6});

        int[] values = df.getValues().toArray();

        assertThat(values.length, is(2));
    }

    @Test
    public void testGetValuesAt() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new int[]{1, 2, 3});
        df.insertRow(1, new int[]{4, 5, 6});

        int[] values = df.getValuesAt(0);

        assertThat(values.length, is(2));
    }

    @Test
    public void testGetValuesRange() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new int[]{1, 2, 3});
        df.insertRow(1, new int[]{4, 5, 6});

        int[] values = df.getValuesInRange(0, 2);

        assertThat(values.length, is(2));
    }

    @Test
    public void testGetValuesBetween() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new int[]{1, 2, 3});
        df.insertRow(1, new int[]{4, 5, 6});

        int[] values = df.getValuesInRange(1, 3);

        assertThat(values.length, is(2));
    }

    @Test
    public void testGetRows() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new String[]{"a", "b", "c"});
        df.insertRow(1, new String[]{"d", "e", "f"});

        Object[] rows = df.getRows();

        assertThat(rows.length, is(2));
    }

    @Test
    public void testGetRowsAt() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new String[]{"a", "b", "c"});
        df.insertRow(1, new String[]{"d", "e", "f"});

        Object[] rows = df.getRowsAt(0);

        assertThat(rows.length, is(2));
    }

    @Test
    public void testGetRowsRange() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new String[]{"a", "b", "c"});
        df.insertRow(1, new String[]{"d", "e", "f"});

        Object[] rows = df.getRowsInRange(0, 2);

        assertThat(rows.length, is(2));
    }

    @Test
    public void testGetRowsBetween() {
        DataFrame df = new DataFrame();
        df.insertRow(0, new String[]{"a", "b", "c"});
        df.insertRow(1, new String[]{"d", "e", "f"});

        Object[] rows = df.getRowsInRange(1, 3);

        assertThat(rows.length, is(2));
    }

    @Test
    public void testInsertRow() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        assertThat(values[0], is(1));
        assertThat(values[1], is(2));
        assertThat(values[2], is(3));
    }

    @Test
    public void testInsertRowAt() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        assertThat(df.getValueAt(0), is(1));
        assertThat(values[0], is(1));
        assertThat(values[1], is(2));
        assertThat(values[2], is(3));
    }

    @Test
    public void testInsertRowRange() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        for (int i : df.getRowsInRange(0, 2)) {
            assertThat(i, is(1));
            assertThat(values[i], is(1));
        }
    }

    @Test
    public void testInsertRowBetween() {
        DataFrame df = new DataFrame();
        df.insertRow("a", Arrays.asList(1, 2, 3));

        int[] values = (int[]) df.getValues().toArray();

        for (int i : df.getRowsInRange(1, 3)) {
            assertThat(i, is(1));
            assertThat(values[i], is(1));
        }
    }

    @Test
    public void testGetMin() {
        DataFrame df = new DataFrame();
        df.insertRow(0, Arrays.asList(1, 2, 3));

        Object[] values = (Object[]) df.getValues().toArray();

        int min = Integer.MAX_VALUE;
        for (int i : values) {
            if (i instanceof Integer) {
                min = Math.min(min, ((Integer) i).intValue());
            }
        }

        assertThat(min, is(1));
    }

    @Test
    public void testGetMax() {
        DataFrame df = new DataFrame();
        df.insertRow(0, Arrays.asList(1, 2, 3));

        Object[] values = (Object[]) df.getValues().toArray();

        int max = Integer.MIN_VALUE;
        for (int i : values) {
            if (i instanceof Integer) {
                max = Math.max(max, ((Integer) i).intValue());
            }
        }

        assertThat(max, is(1));
    }

}