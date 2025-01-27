package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcess_ValidToken {

    @Test
    public void process_ValidToken() {
        Token token = new Token(Token.Type.START_TAG, "tag");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertTrue(treeBuilder.process(token));
    }

}