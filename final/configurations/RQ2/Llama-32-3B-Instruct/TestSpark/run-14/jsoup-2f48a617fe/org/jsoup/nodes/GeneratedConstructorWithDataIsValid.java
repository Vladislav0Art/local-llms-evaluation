package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedConstructorWithDataIsValid {

    @Test
    public void constructorWithDataIsValid() {
        String data = "some comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}