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

public class GeneratedInsertNodeTokenStartTagTest {

    private XmlTreeBuilder treeBuilder = new XmlTreeBuilder();

    @Test
    public void insertNodeTokenStartTagTest() throws IOException {
        Token token = new Token(Token.Type.START_TAG, "tag");
        List<Node> stack = new ArrayList<>();
        treeBuilder.stack = stack;
        treeBuilder.insertNode(token);
        assertEquals(stack.size(), 1);
    }

}