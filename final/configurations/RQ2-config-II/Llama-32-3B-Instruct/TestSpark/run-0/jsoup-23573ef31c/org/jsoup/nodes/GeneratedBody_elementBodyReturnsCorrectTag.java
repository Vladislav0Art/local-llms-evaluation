package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBody_elementBodyReturnsCorrectTag {

    @Test
    public void body_elementBodyReturnsCorrectTag() {
        Document document = Document.createShell("https://www.example.com");
        Element element = document.body();
        assertNotNull(element);
        assertTrue(element.tagName().equals("body"));
    }

}