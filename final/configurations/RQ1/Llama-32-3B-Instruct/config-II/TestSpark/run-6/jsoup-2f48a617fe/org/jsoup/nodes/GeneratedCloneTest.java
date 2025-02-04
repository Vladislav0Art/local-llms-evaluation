package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}