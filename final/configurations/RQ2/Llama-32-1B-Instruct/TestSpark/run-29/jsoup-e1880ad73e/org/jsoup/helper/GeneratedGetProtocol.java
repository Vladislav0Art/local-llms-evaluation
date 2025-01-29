package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedGetProtocol {

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

    public static String getScheme(Connection conn) throws URISyntaxException {
        return conn.getURI().getScheme();
    }

    public static String getHost(Connection conn) throws URISyntaxException {
        return conn.getURI()..getHost();
    }

    public static int getPort(Connection conn) throws URISyntaxException {
        return conn.getURI().getPort();
    }
}

public class UrlBuilderTest {

    @Test
    public void getProtocol() {
        // Arrange
        URLBuilder urlBuilder = build();
        Document doc = Jsoup.connect(urlBuilder.getURI()).get();

        // Act
        String protocol = UrlUtil.getProtocol(doc);

        // Assert
        assertEquals("http", protocol);
    }

}