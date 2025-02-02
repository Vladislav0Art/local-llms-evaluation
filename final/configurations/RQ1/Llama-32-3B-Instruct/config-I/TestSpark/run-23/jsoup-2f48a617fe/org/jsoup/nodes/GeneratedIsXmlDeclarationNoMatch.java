package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedIsXmlDeclarationNoMatch {

    @Test
    public void isXmlDeclarationNoMatch() {
        Comment comment = new Comment("Not an XML declaration");
        assertFalse(comment.isXmlDeclaration());
    }

}