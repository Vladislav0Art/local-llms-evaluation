package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertFalse(connection.ignoreHttpErrors(false));
    }

}