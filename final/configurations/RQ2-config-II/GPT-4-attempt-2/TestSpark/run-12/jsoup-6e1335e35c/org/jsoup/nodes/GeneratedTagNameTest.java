package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

}