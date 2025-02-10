package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import java.io.Reader;
import java.util.List;

public class GeneratedPopStackToCloseEndTagTest {

    @Test
    public void popStackToCloseEndTagTest() {
        Token endTag = new Token(Token.EndTag.TAG);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.popStackToClose(endTag);
        assertTrue(builder.isEmptyStack());
    }

}