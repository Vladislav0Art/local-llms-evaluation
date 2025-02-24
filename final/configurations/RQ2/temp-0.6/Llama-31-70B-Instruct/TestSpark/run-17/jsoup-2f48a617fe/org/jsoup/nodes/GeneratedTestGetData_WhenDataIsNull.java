package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.Appendable;

public class GeneratedTestGetData_WhenDataIsNull {

    @Test
    public void testGetData_WhenDataIsNull() {
        Comment comment = new Comment(null);
        assertEquals("", comment.getData());
    }

}