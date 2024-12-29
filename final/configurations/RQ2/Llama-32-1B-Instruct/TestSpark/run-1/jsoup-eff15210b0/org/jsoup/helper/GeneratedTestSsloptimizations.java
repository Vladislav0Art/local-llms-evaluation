package org.jsoup.helper;

public class GeneratedTestSsloptimizations {

    @Test
    public void testSsloptimizations() {
        MockHttpConnection mock = new MockHttpConnection();
        mock.sslSocketFactory(new MockSSLSocketFactory());
        org.jsoup.helper.HttpConnection.connect(mock.url("http://www.example.com"));
        assertEquals(mock, actual);
    }

}