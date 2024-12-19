package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

public class GeneratedGetData {

    @Test
    public void getData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}