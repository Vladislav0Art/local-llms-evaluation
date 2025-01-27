package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCloneCloneTextSame {

    @Test
    public void cloneCloneTextSame() {
        String text = "Hello World";
        TextNode textNode1 = new TextNode(text);
        TextNode textNode2 = textNode1.clone();
        assertEquals(text, textNode2.text());
    }
}

}