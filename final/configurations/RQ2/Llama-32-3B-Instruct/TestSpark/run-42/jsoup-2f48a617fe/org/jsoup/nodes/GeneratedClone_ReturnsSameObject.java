package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedClone_ReturnsSameObject {

    @Test
    public void clone_ReturnsSameObject() {
        Comment comment = new Comment("data");
        Comment clonedComment = comment.clone();
        assertSame(clonedComment, comment);
    }

}