package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAsXmlDeclarationTest_nonEmptyBody {

    @Test
    public void asXmlDeclarationTest_nonEmptyBody() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertEquals("xml", xmlDecl.name());
        assertEquals("1.0", xmlDecl.attr("version"));
        assertEquals("UTF-8", xmlDecl.attr("encoding"));
    }

}