package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        MockHttpConnection mock = new MockHttpConnection();
        mock.ignoreHttpErrors(false);
        org.jsoup.helper.HttpConnection.connect(mock.url("http://www.example.com"));
        assertEquals(mock, actual);
    }

}