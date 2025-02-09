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

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = Mockito.spy(new XmlTreeBuilder());
        builder.insert(new Doctype());
        Mockito.verify(builder).insert(Mockito.any(Doctype.class));
    }

}