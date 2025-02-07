package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedSetDataShouldSetCommentData {

    @Test
    public void setDataShouldSetCommentData() {
        Comment comment = new Comment("This is a comment");
        comment.setData("This is another comment");
        assertEquals("This is another comment", comment.getData());
    }

}