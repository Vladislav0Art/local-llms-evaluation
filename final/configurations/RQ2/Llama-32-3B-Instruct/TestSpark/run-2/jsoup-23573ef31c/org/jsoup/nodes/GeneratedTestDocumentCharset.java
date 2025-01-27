package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.charset.Charset;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.OutputSettings;

public class GeneratedTestDocumentCharset {

    public static Connection getConnection() {
        return new Connection();
    }

    @Test
    public void testDocumentCharset() {
        Document document = new Document();
        Charset charset = getCharset();
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    public static OutputSettings getOutputSettings() {
        return new OutputSettings();
    }

}