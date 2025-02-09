package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class GeneratedTestAsString {

    @Test
    public void testAsString() {
        // Create document
        Document document = parse("<html><body>Hello World!</body></html>");

        // Get as string
        String result = W3CDom.asString(document);

        // Assert that it's the expected HTML
        assertEquals("<html><body>Hello World!</body></html>", result);
    }

}