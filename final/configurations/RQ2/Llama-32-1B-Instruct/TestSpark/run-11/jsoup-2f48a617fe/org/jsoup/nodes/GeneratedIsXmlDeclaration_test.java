package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedIsXmlDeclaration_test {

    @Test
    public void isXmlDeclaration_test() {
        Comment comment = new Comment("<xml><data/></xml>");
        assertTrue(comment.isXmlDeclaration());
    }

}