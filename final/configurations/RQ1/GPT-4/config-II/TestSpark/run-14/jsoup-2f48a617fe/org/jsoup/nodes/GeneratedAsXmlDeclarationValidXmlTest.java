package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclarationValidXmlTest {

    @Test
    public void asXmlDeclarationValidXmlTest() {
        Comment comment = new Comment("!DOCTYPE html");
        XmlDeclaration decl = comment.asXmlDeclaration();
        Assert.assertNotNull(decl);
    }

}