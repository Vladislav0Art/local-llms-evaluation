package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSetData_GivenData_SetsDataAndReturnsSelf {

    @Test
    public void setData_GivenData_SetsDataAndReturnsSelf() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
        assertTrue(comment.equals(comment));
    }

}