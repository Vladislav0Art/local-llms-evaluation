package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementRemoveClassTest {

    @Test
    public void ElementRemoveClassTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        element.addClass("test");
        element.removeClass("test");
        assertFalse(element.hasClass("test"));
    }

}