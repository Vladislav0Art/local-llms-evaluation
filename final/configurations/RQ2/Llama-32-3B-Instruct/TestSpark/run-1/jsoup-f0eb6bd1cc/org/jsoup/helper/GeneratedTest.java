package org.jsoup.helper;

public class GeneratedTest {

    @Before
    public void setup() throws UnsupportedEncodingException, SQLException {
        Class.forName("javax.sql.Connection");
        Connection connection = DriverManager.getConnection("jdbc:derby:test;user=tst;password=pss");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM table WHERE column = 'äöü'");
    }

    @After
    public void teardown() throws UnsupportedEncodingException, SQLException {
        // Teardown
    }

}