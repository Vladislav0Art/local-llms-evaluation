package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeNameReturnsCorrectNodeName {

    @Test
    public void nodeNameReturnsCorrectNodeName() {
        Document document = new Document("http://example.com");
        String expectedNodeName = "HTMLDocument";
        assertEquals(expectedNodeName, document.nodeName());
    }

}