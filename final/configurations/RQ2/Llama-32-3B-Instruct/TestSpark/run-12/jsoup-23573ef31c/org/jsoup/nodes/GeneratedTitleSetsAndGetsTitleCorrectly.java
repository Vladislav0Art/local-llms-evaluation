package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTitleSetsAndGetsTitleCorrectly {

    @Test
    public void titleSetsAndGetsTitleCorrectly() {
        String title = "Example Title";
        Document doc = new Document();
        doc.title(title);
        assertEquals(title, doc.title());
    }

}