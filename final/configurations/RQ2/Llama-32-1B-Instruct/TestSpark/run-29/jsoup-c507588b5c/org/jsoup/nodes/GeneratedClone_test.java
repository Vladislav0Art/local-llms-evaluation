package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        String text = "This is a test.";
        TextNode node = new TextNode(text);
        TextNode cloned = node.clone();
        assertNotSame(node, cloned);
    }

}