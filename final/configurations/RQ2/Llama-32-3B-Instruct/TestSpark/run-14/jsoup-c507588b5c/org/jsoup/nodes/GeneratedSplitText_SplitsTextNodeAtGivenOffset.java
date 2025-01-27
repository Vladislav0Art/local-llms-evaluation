package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class GeneratedSplitText_SplitsTextNodeAtGivenOffset {

    @Test
    public void splitText_SplitsTextNodeAtGivenOffset() throws IOException {
        TextNode node = new TextNode("text");
        TextNode result1 = (TextNode) node.splitText(0);
        TextNode result2 = (TextNode) node.splitText(4);
        assertEquals("tex", result1.text());
        assertEquals("t", result2.text());
    }

}