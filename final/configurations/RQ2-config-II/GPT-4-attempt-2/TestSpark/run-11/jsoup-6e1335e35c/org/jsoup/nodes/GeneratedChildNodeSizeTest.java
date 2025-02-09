package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element testElement = new Element("testChild"),
                parentElement = new Element("test");

        parentElement.appendChild(testElement);

        assertEquals(1, parentElement.childNodeSize());
    }

}