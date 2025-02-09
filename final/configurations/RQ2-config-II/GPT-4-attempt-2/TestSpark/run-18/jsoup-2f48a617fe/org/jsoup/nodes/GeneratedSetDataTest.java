package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoups.nodes.LeafNode;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        comment.setData("updatedTest");
        Assert.assertEquals("updatedTest", comment.getData());
    }

}