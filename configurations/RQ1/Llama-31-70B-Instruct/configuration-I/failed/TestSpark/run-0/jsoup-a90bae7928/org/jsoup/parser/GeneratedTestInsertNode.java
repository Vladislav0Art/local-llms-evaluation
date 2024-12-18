package org.jsoup.parser;

import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.TokeniserState;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestInsertNode {

    @Mock
    private Tokeniser tokeniser;

    @Test
    public void testInsertNode() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.StartTag();
        token.tagName("tagName");
        xmlTreeBuilder.insertNode(new Element("tagName"), token);
    }

}