package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element testElement = new Element("test", "https://test.com", new Attributes());
        assertFalse(testElement.hasChildNodes());
    }

}