package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test_data");
        Comment commentClone = comment.clone();
        assertEquals(comment.getData(), commentClone.getData());
    }

}