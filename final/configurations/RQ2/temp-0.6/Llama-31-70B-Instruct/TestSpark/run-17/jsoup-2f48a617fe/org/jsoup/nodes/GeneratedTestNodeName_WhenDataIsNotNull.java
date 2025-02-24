package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.Appendable;

public class GeneratedTestNodeName_WhenDataIsNotNull {

    @Test
    public void testNodeName_WhenDataIsNotNull() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

}