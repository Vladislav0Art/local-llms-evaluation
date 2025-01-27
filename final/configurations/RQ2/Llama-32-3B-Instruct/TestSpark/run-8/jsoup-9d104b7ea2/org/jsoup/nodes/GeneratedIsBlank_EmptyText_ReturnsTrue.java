package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_EmptyText_ReturnsTrue {

    @Test
    public void isBlank_EmptyText_ReturnsTrue() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("isBlank"));
        assertEquals(true, Boolean.parseBoolean(node.attr("isBlank")));
    }

}