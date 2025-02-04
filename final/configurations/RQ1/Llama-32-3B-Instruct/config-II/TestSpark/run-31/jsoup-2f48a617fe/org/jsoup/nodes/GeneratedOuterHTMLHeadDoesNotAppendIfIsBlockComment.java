package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Appendable;

public class GeneratedOuterHTMLHeadDoesNotAppendIfIsBlockComment {

    @Test
    public void outerHTMLHeadDoesNotAppendIfIsBlockComment() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

}