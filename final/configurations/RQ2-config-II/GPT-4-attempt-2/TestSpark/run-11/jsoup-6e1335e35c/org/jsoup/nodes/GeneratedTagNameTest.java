package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element testElement = new Element("test");
        assertEquals("test", testElement.TagName());
        testElement.tagName("testChange");
        assertEquals("testChange", testElement.TagName());
    }

}