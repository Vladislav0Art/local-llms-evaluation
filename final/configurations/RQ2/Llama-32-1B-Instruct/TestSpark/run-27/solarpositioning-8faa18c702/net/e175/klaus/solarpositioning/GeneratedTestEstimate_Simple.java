package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestEstimate_Simple {

    @Test
    public void testEstimate_Simple() {
        String date = "2022-01-01";
        int days = 30;
        double averageTemperature = calculateAverageTemperature(date, days);
        System.out.println("Average temperature in " + date + ": " + averageTemperature);
    }

    public static double calculateAverageTemperature(String date, int days) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]) - 1;
        int day = Integer.parseInt(parts[2]);

        Date dateObject = new Date(year, month, day);
        double sum = 0.0;
        for (int i = 1; i <= days; i++) {
            try {
                sum += getAverageTemperature(dateObject);
            } catch (Exception e) {
                System.out.println("No data found for " + dateObject);
            }
        }

        return sum / days;
    }

    public static double getAverageTemperature(Date date) throws Exception {
        // Assuming temperature values are between -20 and 30
        int low = -20;
        int high = 30;

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:sunshine.db")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT avg(temperature) FROM weather WHERE date BETWEEN '" + date.toString() + "' AND '" + date.toString() + " + 1'");

            while (rs.next()) {
                int averageTemperature = rs.getInt("avg(temperature)");
                return averageTemperature;
            }

            throw new Exception();
        }
    }

}