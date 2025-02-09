package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedElementTagBaseUriAttributesTest {

    @Test
    public void ElementTagBaseUriAttributesTest() {
        Element testElement = new Element("test", "https://test.com", new Attributes());
        assertEquals("test", testElement.TagName());
        assertEquals("https://test.com", testElement.baseUri());
    }

}