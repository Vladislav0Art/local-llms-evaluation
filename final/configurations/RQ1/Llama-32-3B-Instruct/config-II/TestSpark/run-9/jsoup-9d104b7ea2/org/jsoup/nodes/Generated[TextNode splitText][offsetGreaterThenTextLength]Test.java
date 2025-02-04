package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode splitText][offsetGreaterThenTextLength]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode splitText][offsetGreaterThenTextLength]Test() {
        final String originalText = "Hello World";
        int offset = 10;
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(offset));
    }
}

}