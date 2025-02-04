package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedClone_ReturnsCorrectClone {

    @Test
    public void clone_ReturnsCorrectClone() {
        TextNode textNode = new TextNode("Some text");
        TextNode clonedTextNode = textNode.clone();
        assertEquals(textNode.text(), clonedTextNode.text());
    }

}