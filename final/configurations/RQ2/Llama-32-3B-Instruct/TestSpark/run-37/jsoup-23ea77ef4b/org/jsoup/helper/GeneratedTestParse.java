package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        // Parse HTML
        Document document = parse("<html><body>Hello World!</body></html>");

        // Get as string
        String result1 = W3CDom.asString(document);
        String result2 = W3CDom.asString(parse("<html></html>"));

        // Assert that they are equal
        assertEquals(result1, result2);
    }

    private Document parse(String html) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            ByteArrayInputStream input = new ByteArrayInputStream(html.getBytes());
            return builder.parse(input);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}