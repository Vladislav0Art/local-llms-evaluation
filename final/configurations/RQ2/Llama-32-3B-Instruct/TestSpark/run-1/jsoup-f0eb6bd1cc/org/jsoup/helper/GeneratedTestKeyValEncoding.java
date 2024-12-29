package org.jsoup.helper;

public class GeneratedTestKeyValEncoding {

    @Test
    public void testKeyValEncoding() throws UnsupportedEncodingException, SQLException {
        try {
            Class.forName("javax.sql.Connection");
            connection = DriverManager.getConnection("jdbc:derby:test;user=tst;password=pss");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM table WHERE column = 'äöü'");
            fail("UnsupportedEncodingException was not thrown");
        } catch (SQLException e) {
            // expected
        }
    }

}