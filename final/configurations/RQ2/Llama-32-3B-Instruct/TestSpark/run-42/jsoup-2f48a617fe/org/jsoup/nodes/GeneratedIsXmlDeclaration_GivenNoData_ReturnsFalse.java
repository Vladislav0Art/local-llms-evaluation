package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsXmlDeclaration_GivenNoData_ReturnsFalse {

    @Test
    public void isXmlDeclaration_GivenNoData_ReturnsFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}