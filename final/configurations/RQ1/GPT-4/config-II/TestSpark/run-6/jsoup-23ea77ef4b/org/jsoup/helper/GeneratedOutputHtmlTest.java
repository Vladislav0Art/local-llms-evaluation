package org.jsoup.helper;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        HashMap<String, String> outputHtml = W3CDom.OutputHtml();
        assertNotNull(outputHtml);
        assertEquals("html", outputHtml.get("method"));
    }

}