package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class GeneratedSplitTextOffsetGreaterThanTextLengthTest {

    @Test
    public void splitTextOffsetGreaterThanTextLengthTest() {
        TextNode node = new TextNode("some text");
        node.splitText(20);
    }

}