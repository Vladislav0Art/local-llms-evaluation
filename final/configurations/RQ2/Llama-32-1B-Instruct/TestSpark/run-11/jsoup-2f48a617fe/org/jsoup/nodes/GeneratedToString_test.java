package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedToString_test {

    @Test
    public void toString_test() {
        Comment comment = new Comment("This is a test");
        assertEquals("<comment>", comment.toString());
    }

}