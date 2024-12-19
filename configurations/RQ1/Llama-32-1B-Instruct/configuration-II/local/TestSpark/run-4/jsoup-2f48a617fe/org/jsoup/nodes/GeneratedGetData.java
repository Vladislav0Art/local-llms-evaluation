package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetData {

    @Test
    public void getData() {
        Comment comment = new Comment("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

}