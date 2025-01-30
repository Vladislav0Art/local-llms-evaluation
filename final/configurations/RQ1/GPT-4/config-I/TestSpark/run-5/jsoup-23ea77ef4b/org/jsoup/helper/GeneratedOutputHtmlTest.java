package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void outputHtmlTest() throws ParserConfigurationException {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertEquals("html", outputHtml.get("method"));
    }

}