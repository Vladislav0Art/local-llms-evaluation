package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[MockableTextNodeCoreValue]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [MockableTextNodeCoreValue]Test() {
        MockableTextNode node = new MockableTextNode("");
        node.coreValue("Hello, World!");
        assertTrue(node.coreValueCalled);
        assertEquals("Hello, World!", node.coreValue);
    }

}