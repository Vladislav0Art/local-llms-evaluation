package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedRemoveClassTest {

    @Test
    public void removeClassTest() {
        Element element = new Element("div");
        element.addClass("myClass");
        element.removeClass("myClass");
        assertFalse(element.hasClass("myClass"));
    }

}