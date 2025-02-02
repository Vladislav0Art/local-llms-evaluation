package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeNotBlank]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeNotBlank]Test() {
        TextNode node = testNode("Hello, World!");
        assertFalse(node.isBlank());
        assertNotEquals("", node.getWholeText());
    }

}