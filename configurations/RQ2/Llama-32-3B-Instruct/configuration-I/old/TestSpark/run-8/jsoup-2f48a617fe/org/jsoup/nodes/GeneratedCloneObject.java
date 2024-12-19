package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedCloneObject {

    @Test
    public void cloneObject() throws CloneNotSupportedException {
        Document doc = new Document();
        Element comment = doc.createElement("comment");
        Element clonedComment = (Element) comment.cloneNode(true);

        assertNotNull(clonedComment);
    }

}