package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedToStringCommentContentTest {

    @Test
    public void toStringCommentContentTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals(comment.toString(), "<!--This is a comment-->");
    }

}