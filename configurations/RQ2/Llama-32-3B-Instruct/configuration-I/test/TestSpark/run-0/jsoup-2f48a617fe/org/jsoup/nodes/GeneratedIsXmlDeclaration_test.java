package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_test {

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

}