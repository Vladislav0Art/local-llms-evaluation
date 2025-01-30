package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String data = "test comment";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        Assert.assertNotSame(comment, cloned);
        Assert.assertEquals(comment.getData(), cloned.getData());
    }

}