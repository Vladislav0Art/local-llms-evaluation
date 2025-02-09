package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("testTag");
        assertEquals("testTag", element.tagName());
    }

}