package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertElementToDocumentTest {

    @Test
    public void convertElementToDocumentTest() {
        org.jsoup.nodes.Element element = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://test.org");
        Document result = new W3CDom().fromJsoup(element);
        assertNotNull(result);
    }

}