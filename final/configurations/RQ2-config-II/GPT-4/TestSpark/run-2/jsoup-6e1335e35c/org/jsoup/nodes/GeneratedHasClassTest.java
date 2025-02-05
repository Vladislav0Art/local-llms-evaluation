package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element element = new Element("div");
        element.addClass("example");
        assertTrue(element.hasClass("example"));
    }

}