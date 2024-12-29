package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadMethodDoesNotThrowException {

    @Test
    public void outerHtmlHeadMethodDoesNotThrowException() throws Exception {
        Parser parser = new Parser();
        Document document = parser.parse("<div><!-- This is a comment -->\n<div>Inner div</div></div>");
        Element element = document.selectFirst("div").firstChild();
        Comment node = (Comment) element;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Node accum = new Appendable() {
            @Override
            public void append(char ch) throws IOException {
            }
        };
        node.outerHtmlHead(out, 0, null);
        assertEquals(50, out.size());
    }

}