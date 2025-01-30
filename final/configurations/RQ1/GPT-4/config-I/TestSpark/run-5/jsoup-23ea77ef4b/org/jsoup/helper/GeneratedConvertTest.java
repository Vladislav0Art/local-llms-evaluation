package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() throws ParserConfigurationException {
        Document in = org.jsoup.Jsoup.parse("<html><head><title>Title</title></head><body>Body</body></html>");
        W3CDom w3CDom = new W3CDom();
        org.w3c.dom.Document out = w3CDom.fromJsoup(in);
        assertEquals("html", out.getDocumentElement().getTagName());
    }

}