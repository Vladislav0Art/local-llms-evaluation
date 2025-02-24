package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode textNode = new TextNode("TextNode");
        TextNode splitTextNode = textNode.splitText(2);
        assertEquals("xtNode", splitTextNode.text());
        assertEquals("Te", textNode.text());
    }

}