package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateElement {

    @Test
    public void createElement() {
        Document document = Document.createShell("https://www.example.com");
        Element element = new Tag();
        assertEquals(element, document.createElement("div"));
    }

}