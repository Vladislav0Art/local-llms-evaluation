package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class GeneratedAppendChild {

    @Test
    public void appendChild() {
        Comment comment = new Comment("data");
        Node child = new Element("p").appendText("Hello, World!");
        comment.appendChild(child);
        assert comment.childNodes().size() == 1;
    }

}