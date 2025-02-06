package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNodeName_nodeNameMethodReturnsCorrectString {

    @Test
    public void nodeName_nodeNameMethodReturnsCorrectString() {
        String expectedNodeName = "#document";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedNodeName, document.nodeName());
    }

}