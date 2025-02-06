package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedSplitText_SplittingAtOffsetReturnsCorrectlySplitTextNode {

    @Test
    public void splitText_SplittingAtOffsetReturnsCorrectlySplitTextNode() throws IOException {
        // Arrange
        TextNode node = new TextNode("Hello\nWorld");
        int offset = 5;

        // Act & Assert
        TextNode result = node.splitText(offset);
        assertEquals(Arrays.asList("Hello", "World"), StringUtil.split(node.text(), '\n'));
    }

}