package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        Comment cloneComment = comment.clone();
        assertEquals(cloneComment.toString(), comment.toString());
    }

}