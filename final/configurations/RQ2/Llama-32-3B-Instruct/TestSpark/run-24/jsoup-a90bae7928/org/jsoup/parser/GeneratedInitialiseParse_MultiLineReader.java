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
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParse_MultiLineReader {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.parser(XmlTreeBuilderTest");
    }

    @Test
    public void initialiseParse_MultiLineReader() {
        String input = "<root><person>\n" +
                "    <name>John Doe</name>\n" +
                "</person>\n" +
                "</root>";
        Reader reader = new StringReader(input);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(reader, "http://example.com", null);
    }

}