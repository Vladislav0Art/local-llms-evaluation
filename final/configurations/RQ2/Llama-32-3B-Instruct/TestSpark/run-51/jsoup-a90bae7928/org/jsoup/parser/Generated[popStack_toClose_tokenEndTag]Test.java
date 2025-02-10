package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

import java.io.Reader;
import java.io.StringReader;

public class Generated[popStack_toClose_tokenEndTag]

Test {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void [popStack_toClose_tokenEndTag]Test() throws Exception {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element parentElement = new Element();
        builder.popStackToClose(parentElement, Token.TokenEndTag.newEndTag("tag"));
        assertNotNull(builder);
    }

}