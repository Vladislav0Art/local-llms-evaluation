package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAsXmlDeclaration_CreatesNewNode {

    @Test
    public void AsXmlDeclaration_CreatesNewNode() {
        String data = "Hello, World!";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals(data.substring(1, data.length() - 1), decl.getContent());
        assertEquals(data.startsWith("!"), decl.isDeclaration());
    }

}