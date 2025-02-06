package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTitle_setTitle_methodSetsCorrectTitle {

    @Test
    public void title_setTitle_methodSetsCorrectTitle() {
        String expectedTitle = "New Example Title";
        Document document = Document.createShell("https://www.example.com");
        document.setTitle(expectedTitle);
        assertEquals(expectedTitle, document.title());
    }

}