package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.jsoup.parser.TokeniserState.EmitDoctypePending;
import org.jsoup.parser.TokeniserState.EmitTagPending;
import org.jsoup.parser.TokeniserState.ReadCharRef;
import org.jsoup.parser.TokeniserState.ReadTagName;
import org.jsoup.parser.TokeniserState.ReadXmlDecl;
import org.jsoup.parser.TokeniserState.ReadXmlDeclName;
import org.jsoup.parser.TokeniserState.ReadXmlDeclValue;
import org.jsoup.parser.TokeniserState.SelfClosingStartTag;
import org.jsoup.parser.TokeniserState.TagName;
import org.jsoup.parser.TokeniserState.XmlDeclAttr;
import org.jsoup.parser.TokeniserState.XmlDeclName;
import org.jsoup.parser.TokeniserState.XmlDeclValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestInitialiseParse {

    @Test
    public void testInitialiseParse() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader reader = new StringReader("");
        String baseUri = "http://example.com";
        Parser parser = new Parser(xmlTreeBuilder);
        xmlTreeBuilder.initialiseParse(reader, baseUri, parser);
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

}