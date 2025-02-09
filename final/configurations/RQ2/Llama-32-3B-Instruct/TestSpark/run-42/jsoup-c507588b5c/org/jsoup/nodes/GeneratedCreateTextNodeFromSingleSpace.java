package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTextNodeFromSingleSpace {

    @Test
    public void createTextNodeFromSingleSpace() {
        String expected = " ";
        assertSame(expected, TextNode.createFromEncoded(" "));
    }

}