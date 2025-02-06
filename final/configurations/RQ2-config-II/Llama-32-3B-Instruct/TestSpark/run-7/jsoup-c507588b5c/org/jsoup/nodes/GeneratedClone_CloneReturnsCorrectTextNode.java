package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedClone_CloneReturnsCorrectTextNode {

    @Test
    public void clone_CloneReturnsCorrectTextNode() {
        // Arrange & Act
        TextNode node = new TextNode("Clone Test");
        TextNode cloned = node.clone();

        // Assert
        assertEquals(node, cloned);
    }

}