package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class GeneratedShouldSplitTextNode {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("test");
    }

    @Test
    public void shouldSplitTextNode() {
        TextNode tailNode = textNode.splitText(2);
        assertEquals("te", textNode.getWholeText());
        assertEquals("st", tailNode.getWholeText());
    }

}