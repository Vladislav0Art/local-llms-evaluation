package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedCommentConstructorTest {

    @Test
    public void commentConstructorTest() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");
    }

}