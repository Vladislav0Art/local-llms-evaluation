package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAsXmlDeclaration_GivenNullData_ReturnsNull {

    @Test
    public void asXmlDeclaration_GivenNullData_ReturnsNull() {
        String data = null;
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}