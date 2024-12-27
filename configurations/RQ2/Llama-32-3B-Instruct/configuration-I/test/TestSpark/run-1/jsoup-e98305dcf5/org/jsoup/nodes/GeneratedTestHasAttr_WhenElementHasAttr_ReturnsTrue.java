package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestHasAttr_WhenElementHasAttr_ReturnsTrue {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void testHasAttr_WhenElementHasAttr_ReturnsTrue() {
        Document doc = new Document();
        Element element = Element.create(tag, "key", "value");
        assertTrue(element.hasAttr("key"));
    }

}