package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTestGetHost {

    private String scheme;
    private String host;
    private int port;

    public Connection(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        this.scheme = doc.attr("scheme");
        this.host = doc.attr("host");
        if (doc.attr("port") != null && !doc.attr("port").isEmpty()) {
            this.port = Integer.parseInt(doc.attr("port"));
        } else {
            throw new Exception("Port not specified in URL");
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

public class Main {

    @Test
    public void testGetHost() throws Exception {
        Connection connection = new Connection("http://example.com");
        assertEquals("example.com", connection.getHost());
    }

}