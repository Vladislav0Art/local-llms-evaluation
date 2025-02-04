package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedCloneTest {

    @Test
    public void CloneTest() {
        Comment originalComment = new Comment("<!-- test -->");
        Comment clonedComment = (Comment) originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

}