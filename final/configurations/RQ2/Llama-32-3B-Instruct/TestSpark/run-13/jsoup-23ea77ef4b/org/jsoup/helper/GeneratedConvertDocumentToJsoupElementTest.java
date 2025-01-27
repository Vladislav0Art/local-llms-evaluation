package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedConvertDocumentToJsoupElementTest {

    @Test
    public void convertDocumentToJsoupElementTest() throws Exception {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.ByteArrayInputStream(html.getBytes()));
        org.jsoup.nodes.Element in = org.jsoup.nodes.Document.parse(html).selectFirst("body").firstChild().asElement();
        Document out = W3CDom.convert(in);
        assertEquals(out, org.jsoup.nodes.Document.parse(html));
    }

}