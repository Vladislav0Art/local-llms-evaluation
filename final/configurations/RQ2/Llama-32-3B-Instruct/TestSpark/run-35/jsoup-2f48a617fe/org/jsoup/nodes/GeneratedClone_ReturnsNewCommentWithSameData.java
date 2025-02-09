package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedClone_ReturnsNewCommentWithSameData {

    @Test
    public void clone_ReturnsNewCommentWithSameData() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertEquals("", clonedComment.getData());
    }

}