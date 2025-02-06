package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTitleMethodReturnsCorrectTitle {

    @Test
    public void titleMethodReturnsCorrectTitle() {
        String title = "Example Title";
        Document document = new Document();
        document.title(title);
        assertEquals(title, document.title());
    }

}