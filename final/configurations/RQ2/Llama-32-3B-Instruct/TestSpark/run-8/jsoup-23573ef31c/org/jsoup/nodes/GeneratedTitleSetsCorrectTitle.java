package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTitleSetsCorrectTitle {

    @Test
    public void titleSetsCorrectTitle() {
        String title = "Example Title";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

}