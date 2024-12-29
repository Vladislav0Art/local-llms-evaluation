package org.jsoup.helper;

public class GeneratedTestReferrer {

    @Test
    public void testReferrer() {
        MockHttpConnection mock = new MockHttpConnection();
        mock.referrer("https://example.com");
        org.jsoup.helper.HttpConnection.connect(mock.url("http://www.example.com"));
        assertEquals(mock, actual);
    }

}