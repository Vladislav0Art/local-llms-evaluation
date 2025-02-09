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

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertNotNull(builder.insert(new StartTag()));
    }

}