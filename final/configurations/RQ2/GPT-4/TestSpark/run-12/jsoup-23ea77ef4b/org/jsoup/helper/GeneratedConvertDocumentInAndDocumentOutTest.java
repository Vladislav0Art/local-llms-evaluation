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

public class GeneratedConvertDocumentInAndDocumentOutTest {

    @Test
    public void convertDocumentInAndDocumentOutTest() {
        W3CDom w3cDom = new W3CDom();
        Document in = new Document("");
        Document out = new Document("");
        w3cDom.convert(in, out);
        assertNotNull(out);
    }

}