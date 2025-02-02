package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeCreatedWithText]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeCreatedWithText]Test() {
        TextNode node = testNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

}