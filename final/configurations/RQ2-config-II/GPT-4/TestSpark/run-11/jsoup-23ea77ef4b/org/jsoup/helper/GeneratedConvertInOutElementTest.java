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

public class GeneratedConvertInOutElementTest {

    @Test
    public void convertInOutElementTest() {
        org.jsoup.nodes.Element element = new Element(org.jsoup.parser.Tag.valueOf("div"), "http://test.org");
        Document out = new W3CDom().fromJsoup(element);
        new W3CDom().convert(element, out);
        assertEquals(out, out);
    }

}