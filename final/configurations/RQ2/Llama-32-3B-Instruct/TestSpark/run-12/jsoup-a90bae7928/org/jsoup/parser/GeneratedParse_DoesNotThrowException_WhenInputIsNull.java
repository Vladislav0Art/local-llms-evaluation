package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;

public class GeneratedParse_DoesNotThrowException_WhenInputIsNull {

    @Test
    public void Parse_DoesNotThrowException_WhenInputIsNull() throws IOException {
        String input = "";
        Reader reader = null;
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document document = treeBuilder.parse(input, null);
        assertNotNull(document);
    }

}