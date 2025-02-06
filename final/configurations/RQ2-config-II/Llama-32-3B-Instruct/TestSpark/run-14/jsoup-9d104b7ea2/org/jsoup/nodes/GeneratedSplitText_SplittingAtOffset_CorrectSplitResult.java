package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;

public class GeneratedSplitText_SplittingAtOffset_CorrectSplitResult {

    @Test
    public void splitText_SplittingAtOffset_CorrectSplitResult() throws Exception {
        TextNode textNode = new TextNode("Hello World");
        LeafNode expectedLeftChild = new LeafNode("Hello");
        LeafNode expectedRightChild = new LeafNode("World");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Appendable accum = new StringBuilder(outputStream);
        expectedRightChild.outerHtmlHead(accum, 0, null);
        textNode.splitText(6).outerHtmlTail(accum, 0, null);
        assertThat(outputStream.toString(), is("<div>Hello</div> <div>World</div>"));
    }

}