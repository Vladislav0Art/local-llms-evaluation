package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateTextNodeFromEmptyString {

    @Test
    public void createTextNodeFromEmptyString() {
        assertSame("", TextNode.createFromEncoded(""));
    }

}