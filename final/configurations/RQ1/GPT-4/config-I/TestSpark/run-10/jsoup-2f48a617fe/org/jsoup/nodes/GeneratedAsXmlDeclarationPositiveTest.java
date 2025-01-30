package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclarationPositiveTest {

    @Test
    public void asXmlDeclarationPositiveTest() {
        Comment comment = new Comment("!DOCTYPE example");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}