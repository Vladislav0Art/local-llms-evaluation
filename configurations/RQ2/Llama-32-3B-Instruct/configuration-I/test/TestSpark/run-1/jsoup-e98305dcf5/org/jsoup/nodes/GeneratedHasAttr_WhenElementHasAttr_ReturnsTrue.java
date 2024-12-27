package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedHasAttr_WhenElementHasAttr_ReturnsTrue {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void hasAttr_WhenElementHasAttr_ReturnsTrue() {
        Element element = new Element(tag, "key", "value");
        assertTrue(element.hasAttr("key"));
    }

}