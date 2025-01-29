package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestJoin {

    @Test
    public void testJoin() {
        String[] columns = {"A", "B", "C"};
        String[][] data1 = {{"1", 10, 100}, {"2", 20, 200}};
        String[][] data2 = {{"x", "y", "z"}, {"4", "5", "6"}};

        public DataFrame join (String[]columns, String[][]data){
            // Create a temporary table
            public Table createTable () {
                return new Table(columns);
            }

            public int getRowCount () {
                return data[0].length;
            }

            public void setRow ( int index, Object[] row){
                for (int i = 0; i < data.length; i++) {
                    data[i][index] = row[i];
                }
            }

            public void addRow (String[]row){
                Table table = createTable();
                for (String column : columns) {
                    table.add(column, row);
                }
            }

            return new DataFrame(data, columns);
        }

        String[] result1 = {"A", "B"};
        join(columns, data1).add("C").setRow(0, "100");
        assertEquals(result1[0], getRowCount());

        Table table2 = createTable();
        for (int i = 0; i < data2.length; i++) {
            table2.add(data2[i][0], data2[i]);
        }

        join(columns, data2).add(0, new Object[]{"x", "y"});
        assertEquals(table2.getRowCount(), getRowCount());

        setRow(1, "4");
        addRow(new String[]{"5", "6"});  // Not needed

        String[] result = {"C", "z"};
        join(columns, data).add(result[0], result);
        assertEquals(result[0], getRowCount());
    }

    public class Table {
        private Object[][] table;
        private int rowCount;

        public Table(String[] columns) {
            this.table = new Object[columns.length][];
            this.rowCount = 0;
        }

        public void add(Object column, Object row) {
            for (int i = 0; i < table.length; i++) {
                if (!table[i].Equals(row)) {
                    table[i] = new Object[]{row};
                    rowCount++;
                    break;
                }
            }
        }

        public int getRowCount() {
            return rowCount;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < columns.length; i++) {
                sb.append(columns[i]).append(": ").append(table[i]);
                if (i < columns.length - 1) {
                    sb.append(", ");
                }
            }
            return sb.toString();
        }

        public static class DataFrame {
            private String[][] data;
            private String[] columns;

            public DataFrame(String[][] data, String[] columns) {
                this.data = data;
                this.columns = columns;
            }

            public void add(String column, Object row) {
                for (int i = 0; i < data.length; i++) {
                    data[i][column] = row;
                }
            }

            public int getRowCount() {
                return data[0].length;
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                for (String column : columns) {
                    sb.append(column).append(": ").append(data[0][column]);
                    if (sb.length() > 1) {
                        sb.append(", ");
                    }
                }
                return sb.toString();
            }

            public static class Table {
                private Object[][] table;
                private int rowCount;

                public Table(String[] columns) {
                    this.table = new Object[columns.length][];
                    this.rowCount = 0;
                }

                public void add(Object column, Object row) {
                    for (int i = 0; i < table.length; i++) {
                        if (!table[i].Equals(row)) {
                            table[i] = new Object[]{row};
                            rowCount++;
                            break;
                        }
                    }
                }

                public int getRowCount() {
                    return rowCount;
                }
            }
        }
    }

}