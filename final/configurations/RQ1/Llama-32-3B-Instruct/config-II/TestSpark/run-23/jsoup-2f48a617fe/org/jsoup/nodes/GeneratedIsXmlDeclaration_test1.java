package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_test1 {

    @Test
    public void isXmlDeclaration_test1() {
        Comment comment = new Comment("This is a test");
        assertTrue(comment.isXmlDeclaration());
    }

}