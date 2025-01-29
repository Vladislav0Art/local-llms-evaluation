package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testParseDefaultSettings() {
        String input = "<root><a/> <b/></root>";
        Document document = new XmlTreeBuilder().defaultSettings(input).parse(input);
        Mockito.verify(document, Mockito.times(2)).appendText(Mockito.anyString());
    }

    @Test
    public void testParseBaseUri() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(input);
        String baseUri = "http://example.com";
        Mockito.when(builder.defaultSettings().baseUri()).thenReturn(baseUri);
    }

    @Test
    public void testParseFragment() {
        String inputFragment = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(inputFragment, "http://example.com", Mockito.mock(Parser.class), Mockito.any Element.class);
        Mockito.verify(builder).parse(Mockito.anyString(), Mockito.eq("http://example.com"), Mockito.eq("http://example.com"), Mockito.any(Parser.class));
    }

    @Test
    public void testParseFragmentWithContext() {
        String inputFragment = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> result = builder.parseFragment(inputFragment, "http://example.com", Mockito.mock(Parser.class), Mockito.any Element.class);
        Mockito.verify(builder).parse(Mockito.anyString(), Mockito.eq("http://example.com"), Mockito.eq("http://example.com"), Mockito.any(Parser.class));
    }

    @Test
    public void testPopStackToCloseEndTag() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token endTag = new Token(Token.EndTag.end(), null, null, true);
        builder.popStackToClose(endTag);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

    @Test
    public void testPopStackToCloseComment() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token commentToken = new Token(Token.Comment.comment(), null, null, true);
        builder.popStackToClose(commentToken);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

    @Test
    public void testPopStackToCloseCharacter() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.Character.character(), null, null, true);
        builder.popStackToClose(token);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

    @Test
    public void testPopStackToCloseDoctype() {
        String input = "<root><a/> <b/></root>";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token d = new Token(Token.Doctype.doctype(), null, null, true);
        builder.popStackToClose(d);
        Mockito.verify(builder).popStackToClose(Mockito.any());
    }

}