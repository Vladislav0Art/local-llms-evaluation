package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertDocumentDomTest {

    @Test
    public void convertDocumentDomTest() {
        W3CDom dom = new W3CDom();
        Document document = new Document("");
        org.w3c.dom.Document out = W3CDom.convert(new Document(""));
        dom.convert(document, out);
        assertNotNull(out);
    }

}