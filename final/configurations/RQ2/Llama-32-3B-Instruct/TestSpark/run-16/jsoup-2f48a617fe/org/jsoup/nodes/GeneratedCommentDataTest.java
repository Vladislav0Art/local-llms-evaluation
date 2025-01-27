package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedCommentDataTest {

    @Test
    public void commentDataTest() {
        Comment comment = new Comment("data");
        assert comment.getData().equals("data");

        String text = "Hello, World!";
        Element element = new Element("div");
        element.appendText(text);
        Node node = element.childNodes().get(0);
        TextNode textNode = (TextNode) node;
        assert textNode.getData().equals(text);
    }

}