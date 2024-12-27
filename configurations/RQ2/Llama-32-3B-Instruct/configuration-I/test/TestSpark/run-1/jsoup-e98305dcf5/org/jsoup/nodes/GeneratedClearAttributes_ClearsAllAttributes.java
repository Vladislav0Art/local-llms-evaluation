package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedClearAttributes_ClearsAllAttributes {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void clearAttributes_ClearsAllAttributes() {
        Element element = new Element(tag, "key1", "value1");
        element.clearAttributes();
        assertNull(element.attr("key1"));
    }

}