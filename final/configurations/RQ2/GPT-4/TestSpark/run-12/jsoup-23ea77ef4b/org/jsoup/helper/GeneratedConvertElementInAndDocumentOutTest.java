package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedConvertElementInAndDocumentOutTest {

    @Test
    public void convertElementInAndDocumentOutTest() {
        W3CDom w3cDom = new W3CDom();
        Element in = new Element("test");
        Document out = new Document("");
        w3cDom.convert(in, out);
        assertNotNull(out);
    }

}