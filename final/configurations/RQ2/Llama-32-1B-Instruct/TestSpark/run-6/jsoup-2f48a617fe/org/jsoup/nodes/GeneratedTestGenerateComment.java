package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGenerateComment {

    private Document document;

    @Before
    public void setup() {
        String commentData = "<p>Comment data</p>";
        document = Jsoup.parse("<html><body></body></html>", "", commentData);
    }

    @Test
    public void testGenerateComment() {
        assertEquals(1, document.getElementById("comments").children().length);
    }

}