package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment originalComment = new Comment("Hello World");
        Comment clonedComment = originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment, clonedComment);
    }

}