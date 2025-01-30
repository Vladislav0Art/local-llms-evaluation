package org.jsoup.helper;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertEquals(1, outputHtml.size());
        assertTrue(outputHtml.containsKey("method"));
        assertEquals("html", outputHtml.get("method"));
    }

}