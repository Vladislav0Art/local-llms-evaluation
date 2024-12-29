package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        MockHttpConnection mock = new MockHttpConnection();
        mock.ignoreContentType(true);
        org.jsoup.helper.HttpConnection.connect(mock.url("http://www.example.com"));
        assertEquals(mock, actual);
    }

}