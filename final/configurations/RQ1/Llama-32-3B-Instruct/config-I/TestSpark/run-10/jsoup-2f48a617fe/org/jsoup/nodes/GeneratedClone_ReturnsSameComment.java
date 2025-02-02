package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedClone_ReturnsSameComment {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void clone_ReturnsSameComment() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertTrue(comment.equals(clonedComment));
    }

}