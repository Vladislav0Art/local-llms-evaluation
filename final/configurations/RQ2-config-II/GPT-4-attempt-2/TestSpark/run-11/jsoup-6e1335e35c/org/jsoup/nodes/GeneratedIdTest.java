package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element testElement = new Element("test");
        testElement.id("test");
        assertEquals("test", testElement.id());
    }

}