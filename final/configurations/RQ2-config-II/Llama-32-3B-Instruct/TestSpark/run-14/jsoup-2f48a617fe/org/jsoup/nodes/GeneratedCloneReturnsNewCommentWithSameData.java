package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedCloneReturnsNewCommentWithSameData {

    @Test
    public void cloneReturnsNewCommentWithSameData() {
        String data = "test";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}