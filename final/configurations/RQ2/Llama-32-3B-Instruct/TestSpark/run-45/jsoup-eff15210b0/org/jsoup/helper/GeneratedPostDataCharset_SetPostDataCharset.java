package org.jsoup.helper;

public class GeneratedPostDataCharset_SetPostDataCharset {

    @Test
    public void postDataCharset_SetPostDataCharset() {
        String charset = "UTF-8";
        Connection connection = HttpConnection.postDataCharset(charset);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}