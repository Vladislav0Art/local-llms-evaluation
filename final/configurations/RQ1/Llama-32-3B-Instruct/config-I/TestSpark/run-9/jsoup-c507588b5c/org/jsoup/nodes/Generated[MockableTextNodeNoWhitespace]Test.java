package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[MockableTextNodeNoWhitespace]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [MockableTextNodeNoWhitespace]Test() {
        MockableTextNode node = new MockableTextNode("");
        assertFalse(node.coreValueCalled);
        assertNull(node.coreValue);
    }

}