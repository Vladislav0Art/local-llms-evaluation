package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.mockito.Mockito.*;

public class GeneratedProcessUnexpectedTokenTest {

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<test></test>";
        String baseUri = "http://test.com";
        xmlTreeBuilder.initialiseParse(new StringReader(input), baseUri, new Parser(xmlTreeBuilder));
        Token token = mock(Token.class);
        when(token.type).thenReturn(null);
        xmlTreeBuilder.process(token);
    }

}