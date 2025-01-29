package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest {

    public String build() throws URISyntaxException {
        return Jsoup.connect(getURI()).get().toString();
    }

    private String getURI() {
        Connection conn = createConnection("http://example.com");
        URI uri = new URI(conn.getScheme(), conn.getHost(), conn.getPort());
        return uri.toString();
    }
}

public class UrlUtil {

    public static int getPort(Connection conn) throws URISyntaxException {
        return conn.getURI().getPort();
    }

    public static String getProtocol(Connection conn) throws URISyntaxException {
        return conn.getURI().getScheme();
    }

    public static String getHost(Connection conn) throws URISyntaxException {
        return conn.getURI()..getHost();
    }
}

public class TestGeneratedTest {

    private UrlBuilder urlBuilder = new UrlBuilder();

}