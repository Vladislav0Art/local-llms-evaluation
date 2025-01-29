package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedSetData_test {

    @Test
    public void setData_test() {
        Comment comment = new Comment("This is a test");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}