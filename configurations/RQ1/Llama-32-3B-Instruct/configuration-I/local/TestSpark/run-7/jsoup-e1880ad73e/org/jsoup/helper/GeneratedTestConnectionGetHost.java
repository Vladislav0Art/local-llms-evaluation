package org.jsoup.helper;

public class GeneratedTestConnectionGetHost {

    private final String host;

    public URL(String url) throws MalformedURLException {
        if (url == null || url.isEmpty()) {
            throw new MalformedURLException("URL cannot be empty");
        }
        this.host = url;
    }

    public String getHost() {
        return host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URL url = (URL) o;
        return host.equals(url.host);
    }

    @Override
    public String toString() {
        return "URL{" +
                "host='" + host + '\'' +
                '}';
    }
}

public class Connection {
    private final String host;

    public Connection(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connection connection = (Connection) o;
        return Objects.equals(host, connection.host);
    }

    @Override
    public String toString() {
        return "Connection{" +
                "host='" + host + '\'' +
                '}';
    }
}

public class UrlBuilder {
    private final URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public void appendToAscii(StringBuilder sb, boolean removeTrailingSlash, boolean decodeQuery) throws MalformedURLException {
        // implementation
    }

    @Override
    public String toString() {
        return url.toString();
    }
}

public class KeyVal {
    private final String key;
    private final String value;

    public KeyVal(URL url) throws MalformedURLException {
        this.key = url.getHost();
        this.value = url.getQuery().replace("=", "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyVal keyVal = (KeyVal) o;
        return Objects.equals(key, keyVal.key) && Objects.equals(value, keyVal.value);
    }

    @Override
    public String toString() {
        return "KeyVal{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

public class GeneratedTest {

    @Test
    public void testConnectionGetHost() {
        Connection connection = new Connection("http://example.com");
        System.out.println(connection.getHost());
    }

}