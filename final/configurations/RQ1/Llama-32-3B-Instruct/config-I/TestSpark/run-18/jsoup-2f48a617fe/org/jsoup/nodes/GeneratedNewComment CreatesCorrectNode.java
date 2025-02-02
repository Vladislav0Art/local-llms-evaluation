package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewComment CreatesCorrectNode {

    @Test
    public void newComment

    CreatesCorrectNode() {
        String data = "test data";
        Comment comment = new Comment(data);
        assert comment.value.equals(data) : "Incorrect data for new comment";
    }

}