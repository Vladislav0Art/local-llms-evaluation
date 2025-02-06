package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeNameReturnsCorrectNodeName {

    @Test
    public void nodeNameReturnsCorrectNodeName() {
        Element tag = new Tag("p");
        Document document = new Document(tag);
        assertEquals("p", document.nodeName());
    }

}