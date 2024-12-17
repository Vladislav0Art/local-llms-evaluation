package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedSplitText_NoOffset {

    @Test
    public void splitText_NoOffset() {
        String text = "hello";
        TextNode node = new TextNode(text);
        int offset = 5;
        assertSame(node, node.splitText(offset));
    }

}