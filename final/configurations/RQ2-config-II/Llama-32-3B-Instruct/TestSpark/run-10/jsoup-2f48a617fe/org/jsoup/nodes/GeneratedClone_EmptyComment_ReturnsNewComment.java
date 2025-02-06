package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_EmptyComment_ReturnsNewComment {

    @Test
    public void clone_EmptyComment_ReturnsNewComment() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertTrue(new Comment(comment.getData()).equals(clonedComment));
    }

}