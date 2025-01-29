package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    private Document createDocument(String content) {
        return new Document();
    }

    @Test
    public void testParse() throws IOException {
        String content = "<html><body>Hello World!</body></html>";
        Document document = parse(content);
        assert document.getElementById("root").text().equals("Hello World!");
    }

    @Test
    public void testParseFragment() throws IOException {
        String fragmentContent = "<p>This is a paragraph.</p>";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").text().equals("This is a paragraph.");
    }

    @Test
    public void testParseStartTag() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

    @Test
    public void testParseCommentToken() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

    @Test
    public void testInsertNode() throws IOException {
        String fragmentContent = "<div><span>This is a span.</span></div>";
        List<Node> nodes = new ArrayList<>();
        nodes.add(createDocument(nodes.get(0)));
        Document document = createDocument(nodes.get(0));
        XmlTreeBuilder instance = new XmlTreeBuilder();
        instance.insert(document.getElementById("root").getElementsByTagName("p").firstNodeChild);
        assert document.getElementById("root").getElementsByTagName("span").size().equals(1);
    }

    @Test
    public void testInsertNodeCommentToken() throws IOException {
        String fragmentContent = "<div><span>This is a span.</span></div>";
        List<Node> nodes = new ArrayList<>();
        nodes.add(createDocument(nodes.get(0)));
        Document document = createDocument(nodes.get(0));
        XmlTreeBuilder instance = new XmlTreeBuilder();
        instance.insert(document.getElementById("root").getElementsByTagName("p").firstNodeChild, document.getElementById("root").getElementsByTagName("span").firstNodeChild);
        assert document.getElementById("root").getElementsByTagName("span").size().equals(1);
    }

    @Test
    public void testInsertNodeCharacterToken() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").firstNodeChild.text().equals("This is a paragraph.");
    }

    @Test
    public void testInsertNodeDoctypeToken() throws IOException {
        String fragmentContent = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        List<Node> nodes = new ArrayList<>();
        nodes.add(createDocument(nodes.get(0)));
        Document document = createDocument(nodes.get(0));
        XmlTreeBuilder instance = new XmlTreeBuilder();
        instance.insert(document.getElementById("root").getElementsByTagName("html").firstNodeChild);
    }

    @Test
    public void testInsertToken() throws IOException {
        String content = "<p>This is a paragraph.</p>";
        Document document = parse(content);
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

    @Test
    public void testPopStackToCloseEndTag() throws IOException {
        String content = "<html><body>Hello World!</body></html>";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.EndTag("html")).isEmpty();
    }

    @Test
    public void testPopStackToCloseCommentToken() throws IOException {
        String content = "<!-- This is a comment -->";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.Comment("<!--")).isEmpty();
    }

    @Test
    public void testPopStackToCloseDoctypeToken() throws IOException {
        String content = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        Document document = createDocument(content);
        XmlTreeBuilder instance = new XmlTreeBuilder();
        assert !instance.popStackToClose(new Token.Doctype("html")).isEmpty();
    }

    @Test
    public void testParseFragmentCommentToken() throws IOException {
        String fragmentContent = "<!-- This is a comment -->";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").getElementsByTagName("p").size().equals(1);
    }

    @Test
    public void testParseFragmentDoctypeToken() throws IOException {
        String fragmentContent = "<!DOCTYPE html><html><body>Hello World!</body></html>";
        List<Node> nodes = parseFragment(fragmentContent, "", new Parser());
        assert !nodes.isEmpty();
        Document document = createDocument(nodes.get(0));
        assert document.getElementById("root").getElementsByTagName("html").size().equals(1);
    }

}