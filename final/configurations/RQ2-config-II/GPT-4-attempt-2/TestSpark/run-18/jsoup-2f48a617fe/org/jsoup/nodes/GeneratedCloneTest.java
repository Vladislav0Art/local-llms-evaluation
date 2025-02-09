package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        Assert.assertEquals(comment.getData(), clonedComment.getData());
        Assert.assertNotSame(comment, clonedComment);
    }

}