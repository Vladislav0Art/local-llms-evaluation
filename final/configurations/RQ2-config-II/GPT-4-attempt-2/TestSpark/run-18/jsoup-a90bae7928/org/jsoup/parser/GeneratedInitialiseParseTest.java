package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Doctype;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = Mockito.spy(new XmlTreeBuilder());
        StringReader reader = new StringReader("");
        builder.initialiseParse(reader, "baseUriTester", new Parser(builder));
        Mockito.verify(builder).initialiseParse(reader, "baseUriTester", new Parser(builder));
    }

}