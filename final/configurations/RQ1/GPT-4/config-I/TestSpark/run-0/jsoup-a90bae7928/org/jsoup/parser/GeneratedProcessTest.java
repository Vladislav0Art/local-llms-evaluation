package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        xmlTreeBuilder.process(new Token.StartTag("tag"));
        xmlTreeBuilder.process(new Token.EndTag("tag"));
        xmlTreeBuilder.process(new Token.Comment("comment"));
        xmlTreeBuilder.process(new Token.Character("character"));
        xmlTreeBuilder.process(new Token.Character("data", Token.Character.Type.CData));
        xmlTreeBuilder.process(new Token.Doctype("doctype"));

        assertEquals(5, xmlTreeBuilder.stack.size());
    }

}