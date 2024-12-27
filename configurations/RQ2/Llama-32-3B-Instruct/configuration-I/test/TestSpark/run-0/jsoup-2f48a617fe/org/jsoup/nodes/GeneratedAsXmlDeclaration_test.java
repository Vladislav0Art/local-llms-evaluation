package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclaration_test {

    @Test
    public void asXmlDeclaration_test() {
        Comment comment = new Comment();
        String xmlComment = comment.asXmlDeclaration();
        assertNotNull(xmlComment);
    }

}