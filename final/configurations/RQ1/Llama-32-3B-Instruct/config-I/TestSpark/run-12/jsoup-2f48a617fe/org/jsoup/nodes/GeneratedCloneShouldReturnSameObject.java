package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneShouldReturnSameObject {

    @Test
    public void cloneShouldReturnSameObject() {
        Comment comment = new Comment("some data");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

}