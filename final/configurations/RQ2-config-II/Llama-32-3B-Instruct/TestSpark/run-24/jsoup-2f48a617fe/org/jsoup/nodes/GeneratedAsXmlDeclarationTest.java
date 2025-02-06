package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAsXmlDeclarationTest {

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("data");
        XmlDeclaration actualDeclaration = comment.asXmlDeclaration();
        assertNotNull(actualDeclaration);
        assertEquals("<!-- data -->", actualDeclaration.toString());
        // assertion code here
    }

}