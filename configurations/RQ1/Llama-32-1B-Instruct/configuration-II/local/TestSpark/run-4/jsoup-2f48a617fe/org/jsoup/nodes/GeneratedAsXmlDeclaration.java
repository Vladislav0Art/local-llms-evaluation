package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAsXmlDeclaration {

    @Test
    public void asXmlDeclaration() {
        String data = "#comment";
        XmlDeclaration xmlDecl = new Comment().asXmlDeclaration();
        assertNull(xmlDecl);
    }

}