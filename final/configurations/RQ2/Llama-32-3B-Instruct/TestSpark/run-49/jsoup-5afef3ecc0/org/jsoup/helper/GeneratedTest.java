package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    private String scheme;
    private String host;
    private int port;

    public static Connection createConnection(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        return new Connection(doc.attr("scheme"), doc.attr("host"));
    }

    public Connection(String scheme, String host) {
        this.scheme = scheme;
        this.host = host;
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}

public class Main {

    @Test
    public void testGetPort() {
        Connection connection = new Connection("http://localhost:8080");
        assertEquals(8080, connection.getPort());
    }
}

class Connection {
    private String scheme;
    private String host;
    private int port;

    public Connection(String url) {
        String[] parts = url.split("/");
        this.scheme = parts[0].substring(0, 4);
        this.host = parts[1];
        parts = host.split(":");
        if (parts.length > 1) {
            this.port = Integer.parseInt(parts[1]);
        } else {
            this.port = 80;
        }
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

}