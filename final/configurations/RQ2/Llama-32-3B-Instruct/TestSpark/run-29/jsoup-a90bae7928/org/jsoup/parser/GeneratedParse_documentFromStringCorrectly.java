package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.util.List;

public class GeneratedParse_documentFromStringCorrectly {

    @Test
    public void parse_documentFromStringCorrectly() {
        // Arrange
        String input = "<html><body>Hello World!</body></html>";
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String baseUri = "http://example.com";

        // Act call to the method
        Document result = treeBuilder.parse(input, baseUri);

        // Assert that return values are correct
        Validate.notNull(result);
    }

}