package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetData_ReturnsCommentContent {

    @Test
    public void getData_ReturnsCommentContent() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}