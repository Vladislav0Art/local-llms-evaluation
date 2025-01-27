package org.jsoup.helper;

public class GeneratedMethodHEADTest {

    @Test
    public void methodHEADTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection method = connection.method(Method.HEAD);
        assertNotNull(method);
    }

}