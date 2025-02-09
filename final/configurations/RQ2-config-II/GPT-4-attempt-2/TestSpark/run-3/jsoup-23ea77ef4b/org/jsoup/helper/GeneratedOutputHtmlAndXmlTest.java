package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlAndXmlTest {

    @Test
    public void outputHtmlAndXmlTest() {
        HashMap<String, String> htmlProperties = W3CDom.OutputHtml();
        assertEquals("html", htmlProperties.get(OutputKeys.METHOD));
        assertEquals("yes", htmlProperties.get(OutputKeys.INDENT));

        HashMap<String, String> xmlProperties = W3CDom.OutputXml();
        assertEquals("xml", xmlProperties.get(OutputKeys.METHOD));
        assertEquals("yes", xmlProperties.get(OutputKeys.INDENT));
    }

}