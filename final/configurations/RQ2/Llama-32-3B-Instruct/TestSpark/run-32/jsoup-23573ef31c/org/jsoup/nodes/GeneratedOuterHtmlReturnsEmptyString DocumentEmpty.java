package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlReturnsEmptyString DocumentEmpty {

    @Test
    public void outerHtmlReturnsEmptyString

    DocumentEmpty() {
        Document document = new Document("https://example.com");
        assertEquals("", document.outerHtml());
    }

}