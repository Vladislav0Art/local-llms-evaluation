package org.jsoup.helper;

public class GeneratedTestProxyWithHostAndPort {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testProxyWithHostAndPort() throws MalformedURLException, URISyntaxException {
        String host = "example.com";
        int port = 8080;
        String proxyAddress = "http://proxy.example.org:3128";
        httpConnection = new HttpConnection(proxy(proxyAddress));
        Connection connection = httpConnection.connect("https://" + host + ":" + port);
        assertNotNull(connection);
    }

}