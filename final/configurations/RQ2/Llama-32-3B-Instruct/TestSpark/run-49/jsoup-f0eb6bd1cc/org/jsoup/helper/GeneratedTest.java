package org.jsoup.helper;

public class GeneratedTest {

    private String path;

    public URL(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}

public interface Connection {
    String getPath();
}

public class ConnectionImpl implements Connection {
    private String path;

    public ConnectionImpl(String path) {
        this.path = path;
    }
}

public class URLImpl implements java.net.URL, Connection {
    private String path;

    public URLImpl(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public void setProtocol(String protocol) {
    }

    @Override
    public void setAuthority(String authority) {
    }

    @Override
    public String getProtocol() {
        return "";
    }

    @Override
    public String getAuthority() {
        return "";
    }

    @Override
    public int port() {
        return 0;
    }

    @Override
    public void setPort(int port) {
    }

    public interface URLConstants {
        String DEFAULT_SCHEME = "http";
    }

    public static class URLParser implements java.net.URLStreamHandler {
        private final URLConstants urlConstants;

        public URLParser(URLConstants urlConstants) {
            this.urlConstants = urlConstants;
        }

        @Override
        public void parseURL(String url, StringBuffer base, java.util.List<java.net.URL> parsedUrls) {
        }
    }
}

public interface UrlBuilder {
    String build();
}

public class ConnectionWrapper implements Connection {
    private String path;

    public ConnectionWrapper(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return this.path;
    }
}

public class URLConstants {
    public static final String DEFAULT_SCHEME = "http";
}

public class UrlBuilderImpl implements UrlBuilder {
    private Connection connection;

    public UrlBuilderImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public String build() {
        // implement the logic to build the URL
        return "http://" + ((ConnectionWrapper) connection).getPath() + "?query=value";
    }
}

public class GeneratedTest {

}