package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        Map<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
        assertEquals("html", outputHtml.get("method"));
    }

}