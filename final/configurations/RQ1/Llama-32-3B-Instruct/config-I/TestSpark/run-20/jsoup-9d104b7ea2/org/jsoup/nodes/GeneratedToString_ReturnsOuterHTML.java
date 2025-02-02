package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedToString_ReturnsOuterHTML {

    @Test
    public void toString_ReturnsOuterHTML() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        assertEquals("<div>Hello World!</div>", textNode.toString());
    }

}