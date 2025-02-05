package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element element = new Element(Tag.valueOf("div"), "http://example.com");
        element.html("<span><a href='http://example.com'>Example</a></span>");

        String expectedHtml = "<span>\n <a href=\"http://example.com\">Example</a>\n</span>";
        assertEquals(expectedHtml, element.html());
    }

}