package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedConvertDocumentToJsoupTest {

    @Test
    public void convertDocumentToJsoupTest() throws Exception {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream(html.getBytes()));
        Document in = org.jsoup.nodes.Document.parse(html);
        Document out = W3CDom.convert(in);
        assertEquals(doc, out);
    }

}