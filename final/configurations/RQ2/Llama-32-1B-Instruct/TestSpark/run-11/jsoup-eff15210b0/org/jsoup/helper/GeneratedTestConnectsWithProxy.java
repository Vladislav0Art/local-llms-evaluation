package org.jsoup.helper;

public class GeneratedTestConnectsWithProxy {

    @Test
    public void testConnectsWithProxy() throws Exception {
        HttpConnection connection = new HttpConnection();
        HttpsURLConnection httpsConnection = new HttpConnection(new Proxy().getScheme(), new InetSocketAddress(httpsConnection.getURI()));
        connection.connect("http://example.com", true);
        assert connection != null;
    }

}