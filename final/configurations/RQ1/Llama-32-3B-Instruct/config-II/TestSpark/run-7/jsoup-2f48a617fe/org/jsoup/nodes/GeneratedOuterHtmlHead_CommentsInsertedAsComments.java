package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

import org.mockito.Mockito;
import org.jsoup.parser.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlHead_CommentsInsertedAsComments {

    @Test
    public void outerHtmlHead_CommentsInsertedAsComments() throws IOException {
        // Given
        String data = "This is a comment";
        Comment comment = new Comment(data);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        Document.OutputSettings outSettings = Mockito.mock(Document.OutputSettings.class);
        int depth = 0;

        // When
        comment.outerHtmlHead(accum, depth, outSettings);

        // Then
        assertEquals("<!--" + data + "-->", out.toString());
    }

}