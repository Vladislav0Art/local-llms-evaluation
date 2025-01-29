package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetElementById {

    private Document document;

    @Before
    public void setup() {
        String commentData = "<p>Comment data</p>";
        document = Jsoup.parse("<html><body></body></html>", "", commentData);
    }

    @Test
    public void testGetElementById() {
        String id = "comments";
        Element element = document.getElementById(id);
        assert (element != null);
        assert (element.hasText());
    }

}