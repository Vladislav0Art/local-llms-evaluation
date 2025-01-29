package org.jsoup.helper;

public class GeneratedTestProxyMethod {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testProxyMethod() throws MalformedURLException, IllegalAccessException {
        String proxyHost = "localhost";
        int proxyPort = 8080;
        Proxy proxy = new com.google.common.util.concurrent.ThreadLocalProxyFactory.create();
        HttpConnection connection = new HttpConnection(proxy);
        assertNotNull(connection.getProxy());
        assertEquals(Proxy.class, connection.getClass().getMethod("getProxy").getClass());
    }

}