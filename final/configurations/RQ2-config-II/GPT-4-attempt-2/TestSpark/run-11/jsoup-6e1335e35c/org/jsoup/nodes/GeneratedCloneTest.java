package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element testElement = new Element("test");
        Element cloneElement = testElement.clone();
        assertEquals(cloneElement.tagName(), testElement.tagName());
    }

}