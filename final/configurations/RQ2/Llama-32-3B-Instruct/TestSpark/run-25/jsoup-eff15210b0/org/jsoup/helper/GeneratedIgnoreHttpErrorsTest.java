package org.jsoup.helper;

public class GeneratedIgnoreHttpErrorsTest {

    @Test
    public void ignoreHttpErrorsTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection ignoreHttpErrors = connection.ignoreHttpErrors(true);
        assertNotNull(ignoreHttpErrors);
    }

}