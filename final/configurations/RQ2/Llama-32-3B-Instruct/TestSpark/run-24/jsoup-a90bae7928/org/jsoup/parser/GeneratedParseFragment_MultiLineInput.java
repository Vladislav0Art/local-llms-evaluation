package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragment_MultiLineInput {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser.XmlTreeBuilderTest");
    }

    @Test
    public void parseFragment_MultiLineInput() {
        String inputFragment = "<root><person>\n" +
                "    <name>John Doe</name>\n" +
                "</person>\n" +
                "</root>";
        Reader reader = new StringReader(inputFragment);
        Element context = null;
        String baseUri = "http://example.com";
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(reader, baseUri, context);
    }

}