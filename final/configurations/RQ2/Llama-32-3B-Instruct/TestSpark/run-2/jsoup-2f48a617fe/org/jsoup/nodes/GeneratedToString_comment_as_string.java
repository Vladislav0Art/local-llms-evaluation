package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToString_comment_as_string {

    @Test
    public void toString_comment_as_string() {
        String data = "CommentData";
        Comment comment = new Comment(data);
        assertEquals("<!--" + data + "-->", comment.toString());
    }

}