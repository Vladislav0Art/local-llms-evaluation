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

public class GeneratedOuterHtmlTailDoesNotModifyTheDOM {

    @Test
    public void outerHtmlTailDoesNotModifyTheDOM() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(false, false);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<--!",
                outContent.toString().trim());
    }

}