package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;

public class GeneratedInitialiseParseReaderInputBaseUriParserTest {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void initialiseParseReaderInputBaseUriParserTest() {
        Reader reader = new StringReader("<root><child/></root>");
        treeBuilder.initialiseParse(reader, "", null);
        assertTrue(treeBuilder.process(new Token(Token.Type.START_TAG, "root")));
    }

}