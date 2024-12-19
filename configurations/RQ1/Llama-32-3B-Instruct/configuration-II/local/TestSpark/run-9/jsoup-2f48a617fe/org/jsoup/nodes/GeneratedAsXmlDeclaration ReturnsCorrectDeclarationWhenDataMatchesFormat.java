package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclaration ReturnsCorrectDeclarationWhenDataMatchesFormat {

    @Test
    public void asXmlDeclaration

    ReturnsCorrectDeclarationWhenDataMatchesFormat() throws IOException {
        Comment comment = new Comment("<!-- !DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\" -->");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotNull(declaration);
    }

}