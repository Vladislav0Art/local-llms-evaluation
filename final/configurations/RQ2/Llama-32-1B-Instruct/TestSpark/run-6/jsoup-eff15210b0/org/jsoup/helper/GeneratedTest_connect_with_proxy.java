package org.jsoup.helper;

public class GeneratedTest_connect_with_proxy {

    private static final String URL = "https://example.com";

    @Test
    public void test_connect_with_proxy() throws MalformedURLException {
        HttpsURLConnection urlConnection = new HttpsURLConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        urlConnection.setProxy(proxy);
        urlConnection.setDoKeepAlive(true);
        String[] headers = {"Host", "example.com"};
        urlConnection.setRequestMethod(Method.HEAD, headers);
        String response = urlConnection.getResponse();
        assert response != null;
    }

}