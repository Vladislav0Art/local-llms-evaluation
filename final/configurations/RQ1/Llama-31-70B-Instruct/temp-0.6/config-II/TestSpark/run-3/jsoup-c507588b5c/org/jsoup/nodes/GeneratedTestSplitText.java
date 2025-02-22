package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    private TextNode textNode;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode("sample text");
    }

    @Test
    public void testSplitText() {
        TextNode tailNode = textNode.splitText(5);
        assertEquals("sample", textNode.getWholeText());
        assertEquals(" text", tailNode.getWholeText());
    }

}