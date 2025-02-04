package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_PrettyPrintedValueIncludesCommentText {

    @Test
    public void outerHtmlHead_PrettyPrintedValueIncludesCommentText() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!--data-->",
                outContent.toString().trim());
    }

}