package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() {
        HashMap<String, String> properties = W3CDom.OutputHtml();
        assertTrue(properties.containsKey("method"));
        assertTrue(properties.containsKey("indent"));
        assertTrue(properties.containsKey("xml-declaration"));
    }

}