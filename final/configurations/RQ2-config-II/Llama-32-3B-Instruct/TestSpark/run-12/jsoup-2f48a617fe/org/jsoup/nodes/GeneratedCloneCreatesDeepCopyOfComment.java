package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneCreatesDeepCopyOfComment {

    @Test
    public void cloneCreatesDeepCopyOfComment() throws IOException {
        Comment comment = new Comment("Some data");
        Comment clonedComment = comment.clone();
        assertTrue(comment.getData().equals(clonedComment.getData()));
    }

}