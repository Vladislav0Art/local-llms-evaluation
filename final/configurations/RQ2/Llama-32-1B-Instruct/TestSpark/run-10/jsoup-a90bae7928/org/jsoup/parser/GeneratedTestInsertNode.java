package org.jsoup.parser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class GeneratedTestInsertNode {

    private TreeBuilder treeBuilder;

    @Before
    public void setup() {
        treeBuilder = new XmlTreeBuilder();
    }

    @Test
    public void testInsertNode() throws Exception {
        String input = "<root><child/></root>";
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        Document document = treeBuilder.parse(input, baseUri);
        List<Node> nodes = document.body().select("node");
        Assert.notNull(nodes, "Expected a valid list of Node objects");

        insertNode(node -> node.appendText("Hello"));
        InsertToken token = new InsertToken(tokenType = Token.Type.CHAR);
        token.value = "World";
        insert(token);

        List<Node> expectedNodes = new ArrayList<>();
        expectedNodes.add(new TextNode("Hello World"));
        Assert.isInstanceOf(List.class, nodes);
        Assert.assertTrue(expectedNodes.equals(nodes));
    }

}