package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedCommentNodeNameTest {

    @Test
    public void commentNodeNameTest() {
        Comment comment = new Comment("");
        assert comment.nodeName().isEmpty();
    }

}