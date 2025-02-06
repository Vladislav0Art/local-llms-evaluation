package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSplitTextAtBeginning {

    @Test
    public void splitTextAtBeginning() {
        String text = "Hello";
        int offset = 0;
        TextNode originalTextNode = new TextNode(text);
        TextNode resultTextNode = originalTextNode.splitText(offset);
        assertNotNull(resultTextNode);
        assertEquals(originalTextNode.text(), resultTextNode.text());
    }

}