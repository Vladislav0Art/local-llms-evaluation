package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagNameWithArgumentsTest {

    @Test
    public void tagNameWithArgumentsTest() {
        Element element = new Element("tag", "https://www.example.org");
        assertEquals("tag", element.tagName());
    }

}