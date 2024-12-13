package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedAsXmlDeclarationTest2 {

    @Test
    public void asXmlDeclarationTest2() {
        Comment comment = new Comment("?xml version=\"1.0\" encoding=\"UTF-8\"?");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}