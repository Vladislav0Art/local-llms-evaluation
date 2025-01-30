package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedOuterHtmlHeadTestWhenPrettyPrint {

    @Test
    public void outerHtmlHeadTestWhenPrettyPrint() {
        Comment comment = new Comment("Test");
        StringBuilder accum = new StringBuilder();

        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        Element parent = new Element(Tag.valueOf("p"), "");
        comment.setParentNode(parent);

        comment.outerHtmlHead(accum, 0, out);
        assertEquals("\n<!--Test-->", accum.toString());
    }

}