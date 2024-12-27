package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedRemoveAttr_WhenElementHasAttr_RemovesAttr {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void removeAttr_WhenElementHasAttr_RemovesAttr() {
        Element element = new Element(tag, "key", "value");
        element.removeAttr("key");
        assertFalse(element.hasAttr("key"));
    }

}