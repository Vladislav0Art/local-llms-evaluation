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

public class GeneratedPopStackToCloseEndTagTest {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void popStackToCloseEndTagTest() throws IOException {
        Token endTagToken = new Token(Token.Type.END_TAG, "tag");
        treeBuilder.stack.push(new Element());
        treeBuilder.popStackToClose(endTagToken);
        assertEquals(0, treeBuilder.stack.size());
    }

}