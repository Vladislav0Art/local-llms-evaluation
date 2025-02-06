package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeNameMethodReturnsComment {

    @Test
    public void nodeNameMethodReturnsComment() {
        Comment comment = new Comment("");
        Element element = Mockito.mock(Element.class);
        comment.setNodeElement(element);
        Assert.assertEquals("comment", comment.nodeName());
    }

}