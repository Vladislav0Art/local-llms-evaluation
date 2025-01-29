package org.jsoup.helper;

public class GeneratedTestGetParser {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testGetParser() throws IOException {
        HttpConnection connection = HttpConnection.connect(new URL("https://example.com?param=value"));
        Parser parser = connection.getParser();
        assert parser != null;
    }

}