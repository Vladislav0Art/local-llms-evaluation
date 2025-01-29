package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestInsert {

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

}