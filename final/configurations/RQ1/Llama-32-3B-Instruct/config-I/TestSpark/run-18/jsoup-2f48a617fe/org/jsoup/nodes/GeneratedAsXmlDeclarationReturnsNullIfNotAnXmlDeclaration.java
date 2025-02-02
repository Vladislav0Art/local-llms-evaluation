package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationReturnsNullIfNotAnXmlDeclaration {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTest");
    }

    @Test
    public void asXmlDeclarationReturnsNullIfNotAnXmlDeclaration() {
        String data = "test";
        Comment comment = new Comment(data);
        assertFalse(comment.asXmlDeclaration() == null) :
        "Should return null for not xml declaration";
    }

}