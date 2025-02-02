package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class Generated[TextNodeCloneTest]

Test {

    @Test
    public void [TextNodeCloneTest]Test() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        TextNode clone = (TextNode) node.clone();
        assertNotNull(clone);
        assertEquals(node.value, clone.value);
    }

}