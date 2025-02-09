package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedClassNamesTest {

    @Test
    public void classNamesTest() {
        Element element = new Element("testTag");
        element.addClass("testClass");
        assertTrue(element.hasClass("testClass"));
    }

}