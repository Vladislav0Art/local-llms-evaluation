package org.jsoup.helper;

public class GeneratedTestParser {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testParser() throws IOException {
        Parser parser = new Parser();
        httpConnection = HttpConnection.connect("https://example.com", parser);
        Assert.assertEquals(parser, (Parser) httpConnection.parser());
    }

}