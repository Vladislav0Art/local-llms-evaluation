package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import javax.xml.parsers.ParserConfigurationException;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse("test.xml");
        HashMap<String, String> result = W3CDom.OutputHtml();
        assertNotNull(result);
    }

}