package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCommentName_ReturnsCorrectValue {

    @Test
    public void CommentName_ReturnsCorrectValue() {
        Comment comment = new Comment("<!-- test -->");
        assertEquals("#comment", comment.nodeName());
    }

}