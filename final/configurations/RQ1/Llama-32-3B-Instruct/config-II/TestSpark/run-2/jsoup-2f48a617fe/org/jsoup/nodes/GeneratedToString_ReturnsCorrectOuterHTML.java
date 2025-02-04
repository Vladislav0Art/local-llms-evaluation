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

public class GeneratedToString_ReturnsCorrectOuterHTML {

    @Test
    public void toString_ReturnsCorrectOuterHTML() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        Comment comment = new Comment("data");
        comment.outerHtml(accum, 0, out);
        assertEquals("<!--data-->",
                outContent.toString().trim());
    }

}