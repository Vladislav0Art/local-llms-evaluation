package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedOuterHtmlHead_element_setsAccumulation {

    @Test
    public void outerHtmlHead_element_setsAccumulation() throws Exception {
        Document document = Document.parse("<html><head></head></html>");
        Element head = document.selectFirst("head");
        head.setAccumulation();
        assertEquals(head.toString(), head.setAccumulation());
    }

}