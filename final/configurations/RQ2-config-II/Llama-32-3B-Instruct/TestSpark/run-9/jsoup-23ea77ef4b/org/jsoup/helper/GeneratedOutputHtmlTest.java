package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.NodeList;

public class GeneratedOutputHtmlTest {

    @Test
    public void OutputHtmlTest() {
        Document doc = new Document();
        HashMap<String, String> result = org.jsoup.helper.W3CDom.OutputHtml();
        assertNotNull(result);
    }

}