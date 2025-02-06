package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedUpdateMetaCharsetElementSetterNotNullFound {

    @Test
    public void updateMetaCharsetElementSetterNotNullFound() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = Document.createShell(connection.getUri());
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}