package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeSplitTextOffsetOutofRangeTest]

Test {

    @Test
    public void [TextNodeSplitTextOffsetOutofRangeTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        int offset = 10;
        try {
            node.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

}