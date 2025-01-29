package org.jsoup.helper;

public class GeneratedTestConnectWithParser {

    @Test
    public void testConnectWithParser() {
        Parser parser = new Normalizer.Parser();
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertEquals(parser, connection.parser());
    }

}