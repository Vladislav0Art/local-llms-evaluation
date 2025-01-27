package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_SimpleText_ReturnsFalse {

    @Test
    public void isBlank_SimpleText_ReturnsFalse() {
        String html = "<span>Hello World</span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("isBlank"));
        assertEquals(false, Boolean.parseBoolean(node.attr("isBlank")));
    }

}