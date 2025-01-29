package app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestQuery {

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