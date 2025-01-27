package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() throws Exception {
        org.jsoup.nodes.Document in = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        Document out = W3CDom.fromJsoup(in);
        assertEquals(out, in);
    }

}