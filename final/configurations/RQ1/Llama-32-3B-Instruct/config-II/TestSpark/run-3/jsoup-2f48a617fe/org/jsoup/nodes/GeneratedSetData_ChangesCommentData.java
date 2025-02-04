package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetData_ChangesCommentData {

    @Test
    public void setData_ChangesCommentData() {
        Comment comment = new Comment("old data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}