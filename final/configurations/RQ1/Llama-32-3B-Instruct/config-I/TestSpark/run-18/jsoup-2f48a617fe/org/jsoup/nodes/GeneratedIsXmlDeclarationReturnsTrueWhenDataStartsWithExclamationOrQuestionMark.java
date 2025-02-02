package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsXmlDeclarationReturnsTrueWhenDataStartsWithExclamationOrQuestionMark {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void isXmlDeclarationReturnsTrueWhenDataStartsWithExclamationOrQuestionMark() {
        String data = "test!";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration()) :"Incorrect result for isXmlDeclaration when data starts with !";
    }

}