package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeIsBlank]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeIsBlank]Test() {
        TextNode node = testNode("");
        assertTrue(node.isBlank());
        assertSame("", node.getWholeText());
    }

}