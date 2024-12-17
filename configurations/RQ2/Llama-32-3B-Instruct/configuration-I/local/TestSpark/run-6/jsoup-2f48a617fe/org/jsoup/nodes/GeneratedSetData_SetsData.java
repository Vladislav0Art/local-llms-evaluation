package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedSetData_SetsData {

    @Test
    public void setData_SetsData() {
        Comment comment = new Comment("Hello World!");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}