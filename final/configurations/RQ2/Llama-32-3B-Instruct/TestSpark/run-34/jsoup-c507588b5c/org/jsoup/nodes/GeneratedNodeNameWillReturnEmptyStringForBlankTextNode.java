package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameWillReturnEmptyStringForBlankTextNode {

    @Test
    public void nodeNameWillReturnEmptyStringForBlankTextNode() {
        TextNode node = new TextNode("");
        assertEquals("", node.nodeName());
    }

}