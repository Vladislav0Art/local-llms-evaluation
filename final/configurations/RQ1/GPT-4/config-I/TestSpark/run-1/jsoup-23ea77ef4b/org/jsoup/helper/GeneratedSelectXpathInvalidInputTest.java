package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSelectXpathInvalidInputTest {

    private static final String SOME_HTML = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";

    @Test
    public void selectXpathInvalidInputTest() {
        W3CDom dom = new W3CDom();
        try {
            dom.selectXpath(null, null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Parameter 'xpath' is required", e.getMessage());
        }
    }

}