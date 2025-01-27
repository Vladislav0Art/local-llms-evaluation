package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedClone_ReturnsSameClassForClone {

    @Test
    public void clone_ReturnsSameClassForClone() {
        Document document = new Document();
        Element element = document.createElement("comment");
        Comment comment = new Comment(element);
        Comment clonedComment = comment.clone();
        assertSame(Comment.class, clonedComment.getClass());
    }

}