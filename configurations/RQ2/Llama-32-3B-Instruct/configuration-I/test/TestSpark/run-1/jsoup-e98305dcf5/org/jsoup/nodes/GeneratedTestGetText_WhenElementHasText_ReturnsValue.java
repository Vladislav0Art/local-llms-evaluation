package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestGetText_WhenElementHasText_ReturnsValue {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void testGetText_WhenElementHasText_ReturnsValue() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertEquals("text", element.text());
    }

}