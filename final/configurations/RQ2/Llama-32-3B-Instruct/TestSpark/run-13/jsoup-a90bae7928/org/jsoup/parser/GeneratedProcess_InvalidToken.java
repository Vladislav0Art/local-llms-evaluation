package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcess_InvalidToken {

    @Test
    public void process_InvalidToken() {
        Token token = new Token(Token.Type.END_TAG, "tag");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        assertFalse(treeBuilder.process(token));
    }

}