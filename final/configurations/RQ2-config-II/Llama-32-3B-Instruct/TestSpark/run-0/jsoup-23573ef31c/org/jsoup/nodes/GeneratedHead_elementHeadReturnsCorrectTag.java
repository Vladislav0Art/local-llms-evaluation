package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedHead_elementHeadReturnsCorrectTag {

    @Test
    public void head_elementHeadReturnsCorrectTag() {
        Document document = Document.createShell("https://www.example.com");
        Element element = document.head();
        assertNotNull(element);
        assertTrue(element.tagName().equals("head"));
    }

}