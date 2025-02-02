package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewComment_GivenData_ReturnsSameData {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void newComment_GivenData_ReturnsSameData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}