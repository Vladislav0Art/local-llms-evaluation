package org.jsoup.helper;

public class GeneratedRequestBody[String]

Test {

    @Test
    public void requestBody[ String]Test() {
        String body = "Hello World!";
        Connection connection = HttpConnection.requestBody(body);
        assertNotNull(connection);
    }

}