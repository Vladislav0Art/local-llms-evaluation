package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class GeneratedText_WhenElementDoesNotHaveText_ReturnsEmptyString {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void text_WhenElementDoesNotHaveText_ReturnsEmptyString() {
        Element element = new Element(tag, null, null);
        assertEquals("", element.text());
    }

}