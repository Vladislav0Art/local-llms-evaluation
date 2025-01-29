package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = (TextNode) node1.clone();
        assertEquals(node1, node2);
    }

}