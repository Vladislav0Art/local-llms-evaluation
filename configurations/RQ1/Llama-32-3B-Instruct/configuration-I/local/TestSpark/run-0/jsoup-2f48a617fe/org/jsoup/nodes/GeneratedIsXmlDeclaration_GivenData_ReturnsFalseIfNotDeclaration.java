package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

public class GeneratedIsXmlDeclaration_GivenData_ReturnsFalseIfNotDeclaration {

    @Test
    public void isXmlDeclaration_GivenData_ReturnsFalseIfNotDeclaration() {
        String data = "This is a comment";
        boolean result = new Comment(data).isXmlDeclaration();
        assertFalse(result);
    }

}