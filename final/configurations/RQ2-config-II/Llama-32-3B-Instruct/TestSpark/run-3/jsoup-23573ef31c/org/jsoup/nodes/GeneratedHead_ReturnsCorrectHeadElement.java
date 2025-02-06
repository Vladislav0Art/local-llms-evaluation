package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedHead_ReturnsCorrectHeadElement {

    @Test
    public void head_ReturnsCorrectHeadElement() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        Element head = document.head();
        assertNotNull(head);
    }

}