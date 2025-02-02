package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNewCommentCreatesCorrectNode {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void newCommentCreatesCorrectNode() {
        String data = "test data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.value) :"Incorrect data for new comment";
    }

}