package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedClone_returnsSameComment {

    @Test
    public void clone_returnsSameComment() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = (Comment) comment.clone();
        assertEquals(comment, clonedComment);
    }

}