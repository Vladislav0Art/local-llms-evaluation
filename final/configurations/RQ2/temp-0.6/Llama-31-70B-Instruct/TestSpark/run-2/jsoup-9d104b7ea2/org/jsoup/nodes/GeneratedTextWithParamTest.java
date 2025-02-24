package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTextWithParamTest {

    @Test
    public void textWithParamTest() {
        TextNode textNode = new TextNode("TextNode");
        assertEquals("TextNode", textNode.text());
        textNode.text("NewTextNode");
        assertEquals("NewTextNode", textNode.text());
    }

}