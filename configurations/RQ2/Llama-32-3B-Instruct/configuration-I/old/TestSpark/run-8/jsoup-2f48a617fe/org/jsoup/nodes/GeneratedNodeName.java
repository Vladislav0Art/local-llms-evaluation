package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNodeName {

    @Test
    public void nodeName() {
        Document doc = new Document();
        Element comment = doc.createElement("comment");
        assertEquals("comment", comment.tagName());
    }

}