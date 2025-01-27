package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedClone_GivenTextNode_ReturnsNewTextNodeWithSameText {

    @Test
    public void clone_GivenTextNode_ReturnsNewTextNodeWithSameText() {
        TextNode node = new TextNode("Hello World");
        TextNode actual = node.clone();
        assertEquals(node, actual);
    }

}