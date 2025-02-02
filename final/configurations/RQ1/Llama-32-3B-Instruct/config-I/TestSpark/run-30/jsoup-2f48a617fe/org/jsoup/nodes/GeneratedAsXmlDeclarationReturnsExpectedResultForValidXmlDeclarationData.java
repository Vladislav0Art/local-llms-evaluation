package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclarationReturnsExpectedResultForValidXmlDeclarationData {

    @Test
    public void asXmlDeclarationReturnsExpectedResultForValidXmlDeclarationData() throws IOException {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
        Comment comment = new Comment(data);
        XmlDeclaration expectedDecl = new XmlDeclaration("html", true);
        assertEquals(expectedDecl, comment.asXmlDeclaration());
    }

}