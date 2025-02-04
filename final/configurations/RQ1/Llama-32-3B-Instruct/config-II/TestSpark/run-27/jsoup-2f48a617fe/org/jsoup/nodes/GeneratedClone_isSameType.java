package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;

public class GeneratedClone_isSameType {

    @Test
    public void clone_isSameType() throws CloneNotSupportedException {
        Comment comment = new Comment("<!-- data -->");
        Comment clonedComment = (Comment) comment.clone();
        assert clonedComment instanceof org.jsoup.nodes.Comment;
    }

}