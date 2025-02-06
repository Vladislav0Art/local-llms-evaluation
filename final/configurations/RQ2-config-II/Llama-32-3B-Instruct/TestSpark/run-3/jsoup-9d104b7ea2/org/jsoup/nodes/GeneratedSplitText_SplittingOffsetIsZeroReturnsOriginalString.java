package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedSplitText_SplittingOffsetIsZeroReturnsOriginalString {

    @Test
    public void splitText_SplittingOffsetIsZeroReturnsOriginalString() {
        TextNode node = new TextNode("test");
        TextNode splitResult = node.splitText(0);
        assertEquals(node, splitResult);
    }

}