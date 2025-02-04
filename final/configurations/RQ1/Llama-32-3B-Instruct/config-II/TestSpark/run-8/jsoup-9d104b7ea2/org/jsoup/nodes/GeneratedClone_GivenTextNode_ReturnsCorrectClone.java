package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_GivenTextNode_ReturnsCorrectClone {

    @Test
    public void clone_GivenTextNode_ReturnsCorrectClone() {
        TextNode textNode = new TextNode("Hello World");
        TextNode clonedTextNode = textNode.clone();
        assertNotNull(clonedTextNode);
        assertEquals(textNode, clonedTextNode);
    }

    static class Mockable extends Object {

        private Object mock;

        public Mockable(Object mock) {
            this.mock = mock;
        }

        public Object getMock() {
            return mock;
        }
    }

}