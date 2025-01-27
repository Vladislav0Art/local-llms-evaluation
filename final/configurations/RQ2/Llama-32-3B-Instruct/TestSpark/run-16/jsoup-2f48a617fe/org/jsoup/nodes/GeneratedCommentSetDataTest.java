package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedCommentSetDataTest {

    @Test
    public void commentSetDataTest() {
        Comment comment = new Comment("");
        comment.setData("data");

        assert comment.getData().equals("data");
    }

}