package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.output.Document.OutputSettings;

public class GeneratedNewTextNode_isEmptyText {

    @Test
    public void newTextNode_isEmptyText() {
        String text = "hello";
        TextNode node = new TextNode(text);
        assertThat(node.text(), is(""));
    }

}