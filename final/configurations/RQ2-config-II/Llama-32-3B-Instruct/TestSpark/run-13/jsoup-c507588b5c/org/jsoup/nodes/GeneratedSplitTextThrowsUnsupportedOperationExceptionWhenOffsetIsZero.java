package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitTextThrowsUnsupportedOperationExceptionWhenOffsetIsZero {

    @Test
    public void splitTextThrowsUnsupportedOperationExceptionWhenOffsetIsZero() {
        TextNode node = new TextNode("Hello World");
        node.splitText(0);
    }

}