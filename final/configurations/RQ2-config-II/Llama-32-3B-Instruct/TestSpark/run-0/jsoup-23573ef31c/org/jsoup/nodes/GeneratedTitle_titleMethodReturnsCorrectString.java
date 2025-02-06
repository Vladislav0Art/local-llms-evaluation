package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTitle_titleMethodReturnsCorrectString {

    @Test
    public void title_titleMethodReturnsCorrectString() {
        String expectedTitle = "Example Title";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedTitle, document.title());
    }

}