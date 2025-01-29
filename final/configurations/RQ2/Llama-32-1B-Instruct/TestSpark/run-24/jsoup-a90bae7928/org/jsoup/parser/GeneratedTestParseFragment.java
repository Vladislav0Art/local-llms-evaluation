package org.jsoup.parser;

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

public class GeneratedTestParseFragment {

    public static void main(String[] args) {
        String baseUri = "http://example.com";
        Document doc = buildDocument(baseUri);
        parse(doc, baseUri);

        // Test insertNode
        Element child = new Element("child");
        parent.insert(child);
        assert insertsOrReturnsNull(null, null, child);

        // Test insertNode with token
        String token = "token";
        Node node = parent.insert(token, element);
        assert insertsOrReturnsNull(node, null, element);

        // Test insertToken
        insertComment(doc, baseUri + "/comment", commentToken -> {
            validateComment(commentToken);
            return true;
        });

        // Test parseFragment
        String inputFragment = "<fragment>fragment</fragment>";
        String outputFragment = doc.toString();
        List<Node> nodes = parseFragment(inputFragment, baseUri, parser);
        assert equals(nodes, outputFragment.split("\n"));

        // Test parseFragment with context
        String inputFragment = "<fragment>fragment</fragment>", element = new Element("element");
        parent.insert(element);
        Element rootElement = parent.parse(inputFragment, element);
        assert insertsOrReturnsNull(rootElement, null, element);

    }

    public static Document buildDocument(String baseUri) {
        return new Document();
    }

    @Test
    public void testParseFragment() {
        String inputFragment = "<fragment>fragment</fragment>";
        String outputFragment = doc.toString();
        List<Node> nodes = parseFragment(inputFragment, baseUri, parser);
        assert equals(nodes, outputFragment.split("\n"));
    }

}