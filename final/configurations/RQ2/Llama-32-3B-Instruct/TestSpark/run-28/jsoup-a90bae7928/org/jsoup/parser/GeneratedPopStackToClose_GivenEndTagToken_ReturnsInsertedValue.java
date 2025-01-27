package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedPopStackToClose_GivenEndTagToken_ReturnsInsertedValue {

    @Test
    public void popStackToClose_GivenEndTagToken_ReturnsInsertedValue() {
        Token.EndTag endTagToken = new Token.EndTag("root");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String insertedValue = treeBuilder.popStackToClose(endTagToken);
        assertNotNull(insertedValue);
        assertEquals("root", insertedValue);
    }

}