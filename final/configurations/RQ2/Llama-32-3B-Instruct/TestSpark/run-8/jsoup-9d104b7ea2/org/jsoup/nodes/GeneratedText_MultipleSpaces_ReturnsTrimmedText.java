package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedText_MultipleSpaces_ReturnsTrimmedText {

    @Test
    public void text_MultipleSpaces_ReturnsTrimmedText() {
        String html = "<span>   Hello   World  </span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("text"));
        assertEquals("Hello World", node.attr("text").trim());
    }

}