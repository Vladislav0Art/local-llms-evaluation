package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedNotXmlDeclarationTest {

    @Test
    public void notXmlDeclarationTest() {
        Comment comment = new Comment("xml version=\"1.0\" ?");
        Assert.assertFalse(comment.isXmlDeclaration());
    }

}