package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedConstructorTextNode_TextIsNotNull {

    @Test
    public void constructorTextNode_TextIsNotNull() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value);
    }

}