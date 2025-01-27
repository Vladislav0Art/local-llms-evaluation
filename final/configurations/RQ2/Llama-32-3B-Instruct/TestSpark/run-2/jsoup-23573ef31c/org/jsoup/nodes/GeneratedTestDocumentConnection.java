package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.charset.Charset;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.OutputSettings;

public class GeneratedTestDocumentConnection {

    public static Connection getConnection() {
        return new Connection();
    }

    @Test
    public void testDocumentConnection() {
        Document document = new Document();
        Connection connection = getConnection();
        document.connection(connection);
        assertNotNull(document.connection());
    }

    public static Charset getCharset() {
        return Charset.forName("UTF-8");
    }

}