package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestGetAttribute_WhenElementHasAttr_ReturnsValue {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void testGetAttribute_WhenElementHasAttr_ReturnsValue() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "value");
        assertEquals("value", element.attr(null));
    }

}