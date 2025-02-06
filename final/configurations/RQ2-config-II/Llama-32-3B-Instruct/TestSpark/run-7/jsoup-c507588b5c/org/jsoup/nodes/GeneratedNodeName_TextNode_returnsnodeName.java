package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedNodeName_TextNode_returnsnodeName {

    @Test
    public void nodeName_TextNode_returnsnodeName() {
        // Arrange & Act
        TextNode node = new TextNode("");
        String result = node.nodeName();

        // Assert
        assertEquals("text", result);
    }

}