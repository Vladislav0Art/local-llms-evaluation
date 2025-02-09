package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element testElement = new Element("div");
        Element childElement = new Element("p");
        testElement.appendChild(childElement);
        assertEquals(1, testElement.childrenSize());
    }

}