package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestGetHtml_WhenElementHasText_ReturnsHtmlString {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void testGetHtml_WhenElementHasText_ReturnsHtmlString() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertEquals("<tag><text></text></tag>", element.html().toString());
    }

}