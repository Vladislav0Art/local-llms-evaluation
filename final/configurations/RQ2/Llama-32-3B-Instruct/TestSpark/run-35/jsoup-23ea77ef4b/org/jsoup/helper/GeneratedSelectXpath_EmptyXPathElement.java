package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public class GeneratedSelectXpath_EmptyXPathElement {

    @Test
    public void selectXpath_EmptyXPathElement() {
        Element element = Element.of("html", "body", "child");
        NodeList nodeList = element.getElementsByTagName("child");
        NodeList selectedNodes = W3CDom.selectXpath("", element);
        assertEquals(0, selectedNodes.getLength());
    }

}