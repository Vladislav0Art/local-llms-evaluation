package org.jsoup.helper;

public class GeneratedTestDataWithStream {

    @Test
    public void testDataWithStream() {
        MockHttpConnection mock = new MockHttpConnection();
        byte[] actual = mock.dataStream("key1", "value1");
        assertEquals(actual, mock);
    }
}

class MockHttpConnection {

    private URL url;
    private Proxy proxy;

    public MockHttpConnection() {
    }

    public void setUrl(String url) {
        this.url = new URL(url);
    }

    public Object data(String key, String value) {
        // implement data method
        return null;
    }

    public Connection connect(String url) {
        this.url = new URL(url);
        return this;
    }

    public Proxy proxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }
}

}