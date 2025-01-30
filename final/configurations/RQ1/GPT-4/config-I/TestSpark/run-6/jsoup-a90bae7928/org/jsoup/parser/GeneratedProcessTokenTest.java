package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "https://some.uri";
        String input = "<tag/>";
        builder.initialiseParse(new StringReader(input), baseUri, new Parser(builder));
        Token tokenStart = new Token.StartTag();
        Token.Comment comment = new Token.Comment();
        Token.Character character = new Token.Character();
        Token.Doctype doctype = new Token.Doctype();
        Token.EndTag endtag = new Token.EndTag();
        tokenStart.name("tag");
        comment.data("<!--Comment-->");
        character.data("CharData");
        doctype.name("doctype");
        endtag.tagName("tag");
        Assert.assertTrue(builder.process(tokenStart));
        Assert.assertTrue(builder.process(comment));
        Assert.assertTrue(builder.process(character));
        Assert.assertTrue(builder.process(doctype));
        Assert.assertTrue(builder.process(endtag));
        Token.EOF eof = new Token.EOF();
        Assert.assertTrue(builder.process(eof));
    }

}