package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://example.com");
        document.createElement("p").text("test");
        assertTrue(document.outerHtml().contains("<p>test</p>"));
    }

}