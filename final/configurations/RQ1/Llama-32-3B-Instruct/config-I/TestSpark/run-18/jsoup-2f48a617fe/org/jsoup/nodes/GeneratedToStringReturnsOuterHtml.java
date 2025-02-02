package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedToStringReturnsOuterHtml {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void toStringReturnsOuterHtml() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(comment.toString(), comment.outerHtml()) :
        "Incorrect outer html for string representation of comment";
    }

}