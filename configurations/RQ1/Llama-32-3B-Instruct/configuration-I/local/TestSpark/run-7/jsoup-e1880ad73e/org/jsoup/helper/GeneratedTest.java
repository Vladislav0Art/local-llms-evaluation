package org.jsoup.helper;

public class GeneratedTest {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://example.com");
        System.out.println(url.getHost());

        Connection connection = new Connection("http://example.com");
        System.out.println(connection.getHost());

        UrlBuilder builder = new UrlBuilder(url);
        StringBuilder sb = new StringBuilder();
        builder.appendToAscii(sb, false, true);
        System.out.println(sb.toString());
    }
}

public class URL {
    private String host;

    public URL(String url) throws MalformedURLException {
        if (url == null || url.isEmpty()) {
            throw new MalformedURLException("URL cannot be empty");
        }
        host = url;
    }

    public String getHost() {
        return host;
    }
}

public class Connection {
    private String host;

    public Connection(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
}

public class UrlBuilder {
    private URL url;

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

public class KeyVal implements Comparable<KeyVal> {
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
    public int compareTo(KeyVal that) {
        return this.key.compareTo(that.key);
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

}