package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedAsXmlDeclarationAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationAsXmlDeclarationTest() {
        Comment comment = new Comment("<xml>test</xml>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration != null && xmlDeclaration.toString().contains("<xml>"));
    }

}