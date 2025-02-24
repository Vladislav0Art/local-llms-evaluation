package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestTextWithEmptyString {

    @Test
    public void testTextWithEmptyString() {
        TextNode node = new TextNode("test");
        node.text("");
        assertEquals("", node.text());
    }

}