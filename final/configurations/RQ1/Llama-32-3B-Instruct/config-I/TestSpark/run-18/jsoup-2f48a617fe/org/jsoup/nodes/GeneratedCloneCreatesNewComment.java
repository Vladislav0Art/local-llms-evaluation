package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCloneCreatesNewComment {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void cloneCreatesNewComment() {
        String data = "test";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertNotEquals(comment, clonedComment) :
        "Comments should not be equal after cloning";
    }

}