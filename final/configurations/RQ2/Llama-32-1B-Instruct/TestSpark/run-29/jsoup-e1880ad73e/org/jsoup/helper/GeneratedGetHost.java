package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedGetHost {

    public String build() throws URISyntaxException {
        return Jsoup.connect(getURI()).get().toString();
    }

    private String getURI() {
        Connection conn = createConnection("http://example.com");
        URI uri = new URI(conn.getScheme(), conn.getHost(), conn.getPort());
        return uri.toString();
    }
}

class UrlUtil {

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

public class UrlBuilderTest {

    @Test
    public void getHost() {
        // Arrange
        URLBuilder urlBuilder = new UrlBuilder();
        Connection conn = createConnection("http://example.com");
        Document doc = Jsoup.connect(conn).get();

        // Act
        String host = urlBuilder.getHost().toString();

        // Assert
        assertEquals("example.com", host);
    }

}