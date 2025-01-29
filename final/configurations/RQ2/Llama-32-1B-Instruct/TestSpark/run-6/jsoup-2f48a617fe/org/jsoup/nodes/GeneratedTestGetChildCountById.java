package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetChildCountById {

    private Document document;

    @Before
    public void setup() {
        String commentData = "<p>Comment data</p>";
        document = Jsoup.parse("<html><body></body></html>", "", commentData);
    }

    @Test
    public void testGetChildCountById() {
        String id = "comments";
        int childCount = document.getElementById(id).children().length;
        assertEquals(2, childCount);
    }

}