package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedAddClassTest {

    @Test
    public void addClassTest() {
        Element element = createElement();
        element.addClass("test");
        assertTrue(element.hasClass("test"));
    }

}