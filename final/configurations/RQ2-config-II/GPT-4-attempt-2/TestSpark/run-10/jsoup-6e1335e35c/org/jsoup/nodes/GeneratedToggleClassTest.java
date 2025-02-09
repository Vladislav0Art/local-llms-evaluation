package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedToggleClassTest {

    @Test
    public void toggleClassTest() {
        Element element = new Element("div").toggleClass("test");
        assertTrue(element.hasClass("test"));
        element.toggleClass("test");
        assertFalse(element.hasClass("test"));
    }

}