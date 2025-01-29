package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testInsert() {
        // Insert data into table
        public void insertTable (String[]data){
            for (int i = 0; i < data.length; i++) {
                String column1 = data[i];
                String column2 = data[i + 1];

                // Logic to insert data into table
                if (i == 0) {
                    System.out.println("Inserting first row: (" + column1 + ", " + column2 + ")");
                } else {
                    try {
                        // Simulate INSERT query
                        for (int j = i - 1; j > 0; j--) {
                            System.out.println(j + ": (" + data[j] + ", " + data[j + 1] + ")");
                        }

                        String column1Value = data[i];
                        String column2Value = data[i + 1];

                        // Logic to insert data into table
                    } catch (Exception e) {
                        System.out.println("Error inserting row: " + e.getMessage());
                    }
                }
            }
        }

        public void testInsert () {
            // Insert data into table
            String[] data = {"Name", "Age"};
            insertTable(data);
        }
    }

    @Test
    public void testSelect() {
        // Select data from table
        public void selectFromTable (String[]column1, String[]column2){
            for (int i = 0; i < column1.length; i++) {
                String column1Value = column1[i];
                String column2Value = column2[i];

                try {
                    // Simulate SELECT query
                    if (i == 0) {
                        System.out.println("Selecting first row: (" + column1[0] + ", " + column2[0] + ")");
                    } else {
                        System.out.println(i + ": (" + column1[i] + ", " + column2[i] + ")");
                    }
                } catch (Exception e) {
                    System.out.println("Error selecting row: " + e.getMessage());
                }

            }
        }

        public void testSelect () {
            // Select data from table
            String[] column1 = {"Name", "Age"};
            String[] column2 = {"John", "30"};
            selectFromTable(column1, column2);
        }
    }

    @Test
    public void testQuery() {
        // Query data from table using SELECT statement
        public void query (String[]column1, String[]column2){
            for (int i = 0; i < column1.length; i++) {
                String column1Value = column1[i];
                String column2Value = column2[i];

                try {
                    // Simulate SELECT query
                    if (i == 0) {
                        System.out.println("Selecting first row: (" + column1[0] + ", " + column2[0] + ")");
                    } else {
                        System.out.println(i + ": (" + column1[i] + ", " + column2[i] + ")");
                    }
                } catch (Exception e) {
                    System.out.println("Error selecting row: " + e.getMessage());
                }

            }
        }

        public void testQuery () {
            // Query data from table using SELECT statement
            String[] column1 = {"Name", "Age"};
            String[] column2 = {"John", "30"};
            query(column1, column2);
        }
    }

}