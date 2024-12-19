package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedSplitText_ReturnsNewTextNodesWithOriginalTextBeforeAndAfterOffset {

    private static final String TEXT = "Hello, World!";
    @Mock
    private Appendable parentElement;

    private TextNode textNode;
    private Document document;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode(TEXT);
        document = new Document();
        document.documentElement = document.createElement("text");
        document.appendChild(document.documentElement);
    }

    @Test
    public void splitText_ReturnsNewTextNodesWithOriginalTextBeforeAndAfterOffset() {
        textNode = new TextNode("Hello, ");
        String originalText = "Hello, ";
        int offset = 3;
        String resultText1 = textNode.splitText(offset);
        String resultText2 = textNode.splitText(offset + 1);
        assertEquals(originalText.substring(0, offset), resultText1.value(), 10);
        assertEquals(originalText.substring(offset), resultText2.value(), 10);
    }

}