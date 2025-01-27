package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNodeName_EmptyText_ReturnsEmptyString {

    @Test
    public void nodeName_EmptyText_ReturnsEmptyString() {
        String html = "<span></span>";
        Document document = Jsoup.parse(html);
        Element node = document.selectFirst("span");
        assertTrue(node.hasAttr("nodeName"));
        assertEquals("", node.attr("nodeName").trim());
    }

}