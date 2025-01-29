package org.jsoup.helper;

public class GeneratedTestConnectWithParser {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithParser() throws IOException {
        HttpConnection connection = new HttpConnection();
        Parser parser = new Parser();
        connection.parser(parser);
        assertEquals("http://example.com", connection.get().toString());
    }

}