package org.jsoup.helper;

public class GeneratedWhenAppendedQuery {

    private String path;

    public URL(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}

public class ConnectionImpl implements Connection {
    private String path;

    public ConnectionImpl(String path) {
        this.path = path;
    }
}

public interface Connection {
    String getPath();
}

public class URLImpl implements java.net.URL, URL {
    private String path;

    public URLImpl(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return this.path;
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

    @Test
    public void whenAppendedQuery() {
        UrlBuilder builder = new UrlBuilderImpl(new ConnectionWrapper("http://example.com"));
        assertEquals("http://example.com?query=value", builder.build().getEncodedUrl());
    }

}