package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedHtml_WhenElementHasHtml_ReturnsValue {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void html_WhenElementHasHtml_ReturnsValue() {
        Element element = new Element(tag, "key", "value");
        assertEquals("<tag key=\"value\"></tag>", element.html().toString());
    }

}