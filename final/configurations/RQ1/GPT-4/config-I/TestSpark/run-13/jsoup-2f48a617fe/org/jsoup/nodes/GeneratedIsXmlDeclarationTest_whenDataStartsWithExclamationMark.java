package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsXmlDeclarationTest_whenDataStartsWithExclamationMark {

    @Test
    public void isXmlDeclarationTest_whenDataStartsWithExclamationMark() {
        Comment comment = new Comment("!data");
        assertTrue(comment.isXmlDeclaration());
    }

}