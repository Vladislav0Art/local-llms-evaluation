package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestUserAgent {

    private String url = "http://www.example.com";
    private Connection connection;

    public Response newRequest() {
        return new Response();
    }

    public void timeout(int milliseconds) {
        this.timeout(milliseconds);
    }

    public void maxBodySize(long size) {
        this.maxBodySize(size);
    }

    public void followRedirects(boolean follow) {
        this.followRedirects(follow);
    }

    public String userAgent(String value) {
        this.userAgent(value);
        return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
    }

    public void proxy(Proxy proxy) {
        this.proxy(proxy);
    }

    private Connection connect(String url) {
        try {
            return Jsoup.connect(url).userAgent(this.userAgent()).timeout(this.timeout().nextInt milliseconds());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private int timeout() {
        return 1000;
    }

    public String[] dataAsStrings(String key, String value) {
        Element element = Jsoup.connect(url).data(key, value).get();
        return element.text().split("\r?\n");
    }

    public InputStream dataAsInputStream(String contents) {
        Document document = Jsoup.parse(new java.net.URL("http://www.example.com").openStream(contents));
        return document.body().byteStream();
    }
}

class Proxy {
    private String host;

    public Proxy(String host) {
        this.host = host;
    }

    public Connection proxy(String url) {
        try {
            String[] parts = url.split(":");
            if (parts.length > 1 && parts[0].equals("http")) {
                return Jsoup.connect(url).userAgent(this.userAgent()).timeout(1000);
            } else {
                return new Connection().connect(parts[0]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getHost() {
        return host;
    }
}

class MockProxy implements Proxy {
    @Override
    public Connection proxy(String url) {
        return new MockHttpConnection().proxy(this);
    }

    @Override
    public String getHost() {
        return null;
    }
}

class Response {

    private java.util.Map<String, String> data;

    public Response() {
        this.data = new java.util.HashMap<>();
    }

    public void addData(String key, String value) {
        this.data.put(key, value);
    }

    @Override
    public java.util.List<String> toString() {
        return data.keySet().stream()
                .map(key -> key + ": " + data.get(key))
                .collect(Collectors.toList());
    }
}

class MockSSLSocketFactory implements javax.net.ssl.SSLSocketFactory {
    private static final String KEY_PASSWORD = "";

    @Override
    public javax.net.ssl.SSLContext getSSLContext() throws Exception {
        return new javax.net.ssl.SSLSocketFactory() {
            @Override
            protected java.security.PrivateKey createKeyStorePrivateKey(java.security.spec.KeySpec keySpec, java.io.InputStream in) throws java.security.NoSuchAlgorithmException, javax.crypto.exceptions.MismatchedJCEAlgorithmException, java.io.IOException {
                throw new UnsupportedOperationException("Not implemented");
            }

            @Override
            public java.net.InsecureSessionSocketFactory getInsecureSSLSessionSocketFactory() {
                return this;
            }
        };
    }
}

class MockHttpConnectionTest {

    @Test
    public void testUserAgent() {
        MockHttpConnection mock = new MockHttpConnection();
        Response actual = (Response) mock.newRequest();
        String value = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3";
        actual = mock.connect("http://www.example.com");
        assertEquals(value, ((MockHttpConnection) actual).userAgent());
    }

}