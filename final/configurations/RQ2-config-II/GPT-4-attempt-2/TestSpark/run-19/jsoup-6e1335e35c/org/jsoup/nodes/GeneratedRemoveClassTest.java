package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedRemoveClassTest {

    @Test
    public void removeClassTest() {
        Element element = new Element("testTag");
        element.addClass("testClass");
        element.removeClass("testClass");
        assertFalse(element.hasClass("testClass"));
    }

}