package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConstructor_WithData_CreatesComment {

    @Test
    public void constructor_WithData_CreatesComment() {
        Comment comment = new Comment("data");
        Mockito.verify(comment).setData("data");
    }

}