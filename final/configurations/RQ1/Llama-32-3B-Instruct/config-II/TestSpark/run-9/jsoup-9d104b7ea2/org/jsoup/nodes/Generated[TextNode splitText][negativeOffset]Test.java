package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class Generated[
TextNode splitText][negativeOffset]

Test {

    private TextNode textNode = new TextNode("Hello World");

    @Test
    public void [TextNode splitText][negativeOffset]Test() {
        assertThrows(IllegalArgumentException.class, () -> textNode.splitText(-1));
    }

}