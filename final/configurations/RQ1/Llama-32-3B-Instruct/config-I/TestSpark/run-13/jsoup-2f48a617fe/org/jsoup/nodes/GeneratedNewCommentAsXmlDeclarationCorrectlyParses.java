package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNewCommentAsXmlDeclarationCorrectlyParses {

    @Test
    public void newCommentAsXmlDeclarationCorrectlyParses() throws IOException {
        Comment comment = new Comment("!<?xml version='1.0' encoding='UTF-8'?><root><child/></root>");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals("Hello, World!", decl.getDECLARATION());
    }

}