package org.jsoup.helper;

public class GeneratedTestParserMethod {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testParserMethod() throws UnsupportedMimeTypeException {
        Parser parser = new org.jsoup.parser.Parser();
        HttpConnection connection = new HttpConnection(parser);
        assertNotNull(connection.getParser());
        assertEquals(Parser.class, connection.getClass().getMethod("getParser").getClass());
    }
}

public class RequestTest {
    private static final String MESSAGE = "Hello, world!";

    public static Request newRequest() {
        return new Request(MESSAGE);
    }

}