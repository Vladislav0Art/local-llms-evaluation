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

public class GeneratedOuterHtmlHead_appendsToHead {

    @Test
    public void outerHtmlHead_appendsToHead() throws IOException {
        Document document = Document.parse("<html><head></head></html>");
        Appendable accum = new StringBuilder();
        int depth = 0;
        TextNode node = new TextNode("test");
        node.outerHtmlHead(accum, depth, document.outputSettings());

        assertThat(accum.toString(), is("<p>test</p>"));
    }

}