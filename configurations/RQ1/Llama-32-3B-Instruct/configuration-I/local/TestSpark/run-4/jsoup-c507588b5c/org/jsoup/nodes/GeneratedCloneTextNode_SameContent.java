package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedCloneTextNode_SameContent {

    @Test
    public void cloneTextNode_SameContent() {
        String text = "hello";
        TextNode node = new TextNode(text);
        assertSame(node, node.clone());
    }

}