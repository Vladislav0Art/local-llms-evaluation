package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeNameTest {

    @Mock
    private Document documentMock;

    @Mock
    private LeafNode leafNodeMock;

    @Test
    public void NodeNameTest() {
        // Arrange
        TextNode textNode = new TextNode("TextNodeTest");

        // Act
        String nodeName = textNode.nodeName();

        // Assert
        assertEquals("#text", nodeName);
    }

}