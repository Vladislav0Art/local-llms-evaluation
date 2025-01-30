package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void SetDataTest() {
        Comment comment = new Comment("test");
        comment.setData("updated");
        assertEquals("updated", comment.getData());
    }

}