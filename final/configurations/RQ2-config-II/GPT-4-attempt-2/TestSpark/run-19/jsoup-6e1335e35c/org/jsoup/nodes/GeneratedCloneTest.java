package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element element = new Element("testTag");
        Element clone = element.clone();
        assertEquals(element.tagName(), clone.tagName());
        assertNotEquals(System.identityHashCode(element), System.identityHashCode(clone));
    }

}