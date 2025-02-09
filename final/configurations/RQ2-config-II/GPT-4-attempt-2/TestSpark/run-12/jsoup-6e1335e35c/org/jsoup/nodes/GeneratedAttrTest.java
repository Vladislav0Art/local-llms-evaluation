package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("id", "testId");
        assertEquals("testId", element.attr("id"));
    }

}