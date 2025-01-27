package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedCloneComment_ReturnsNewComment {

    @Test
    public void cloneComment_ReturnsNewComment() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment, cloned);
    }

}