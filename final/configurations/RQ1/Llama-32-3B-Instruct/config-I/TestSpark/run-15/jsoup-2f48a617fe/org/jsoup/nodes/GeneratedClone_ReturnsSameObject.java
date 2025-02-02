package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedClone_ReturnsSameObject {

    @Test
    public void clone_ReturnsSameObject() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

}