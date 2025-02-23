package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedShouldReturnNodeName {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("some text");
    }

    @Test
    public void shouldReturnNodeName() {
        // when
        String nodeName = textNode.nodeName();

        // then
        assertEquals("#text", nodeName);
    }

}