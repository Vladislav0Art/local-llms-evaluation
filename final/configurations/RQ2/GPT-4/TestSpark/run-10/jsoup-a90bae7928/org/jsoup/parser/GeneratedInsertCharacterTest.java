package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertCharacterTest {

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.StartTag("root"));
        builder.insert(new Token.Character("test char"));
        TextNode textNode = (TextNode) builder.stack.peek().childNode(0);
        assertEquals("test char", textNode.getWholeText());
    }

}