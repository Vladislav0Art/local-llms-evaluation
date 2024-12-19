package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextTest_OffsetEnd {

    @Test
    public void splitTextTest_OffsetEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(4);
        assertEquals("", result.text());
        assertEquals("test", textNode.text());
    }

}