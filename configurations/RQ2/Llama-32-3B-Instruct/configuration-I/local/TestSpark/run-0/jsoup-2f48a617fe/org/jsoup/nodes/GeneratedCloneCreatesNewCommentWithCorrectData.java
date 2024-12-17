package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneCreatesNewCommentWithCorrectData {

    @Test
    public void cloneCreatesNewCommentWithCorrectData() throws CloneNotSupportedException {
        public Comment originalComment = new public Comment("This is a comment");
        public Comment clonedComment = originalComment.clone();
        String expectedData = "This is a comment";
        assertTrue(clonedComment.getData().equals(expectedData));
    }

}