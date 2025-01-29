package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private Document document;

    @Before
    public void setup() {
        String commentData = "<p>Comment data</p>";
        document = Jsoup.parse("<html><body></body></html>", "", commentData);
    }

}