package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("testTag");
        element.id("testId");
        assertEquals("testId", element.id());
    }

}