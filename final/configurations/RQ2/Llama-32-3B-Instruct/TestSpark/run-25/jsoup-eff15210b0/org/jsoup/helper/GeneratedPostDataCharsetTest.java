package org.jsoup.helper;

public class GeneratedPostDataCharsetTest {

    @Test
    public void postDataCharsetTest() {
        String charset = "UTF-8";
        Connection connection = HttpConnection.connect("https://example.com");
        Connection postDataCharset = connection.postDataCharset(charset);
        assertNotNull(postDataCharset);
    }

}