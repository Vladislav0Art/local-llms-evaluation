package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.Map;

public class GeneratedFromJsoupElementTest {

    @Test
    public void fromJsoupElementTest() throws Exception {
        org.jsoup.nodes.Element in = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>").selectFirst("body").firstChild().asElement();
        Document out = W3CDom.fromJsoup(in);
        assertEquals(out, org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>"));
    }

}