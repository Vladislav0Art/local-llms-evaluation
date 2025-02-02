package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedAsXmlDeclarationReturnsCorrectlyWhenIsXMLDeclarationWithAttributes {

    @Test
    public void asXmlDeclarationReturnsCorrectlyWhenIsXMLDeclarationWithAttributes() {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\" attr=\"value\"";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("attr", decl.attributes().firstKey());
    }

}