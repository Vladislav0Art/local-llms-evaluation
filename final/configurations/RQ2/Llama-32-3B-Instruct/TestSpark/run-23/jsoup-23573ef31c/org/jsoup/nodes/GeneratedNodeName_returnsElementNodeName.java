package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedNodeName_returnsElementNodeName {

    @Test
    public void nodeName_returnsElementNodeName() {
        Document document = new Document("https://example.com");
        String nodeName = "HTML";
        Element element = document.nodeName(nodeName);
        assertNotNull(element);
        assertEquals(nodeName, element.tagName());
    }

}