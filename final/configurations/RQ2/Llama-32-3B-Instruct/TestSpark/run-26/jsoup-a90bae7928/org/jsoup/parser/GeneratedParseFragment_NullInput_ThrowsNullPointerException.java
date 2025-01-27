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
import org.jsoup.nodes.Token;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragment_NullInput_ThrowsNullPointerException {

    @Test
    public void parseFragment_NullInput_ThrowsNullPointerException() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertThrows(NullPointerException, () -> builder.parseFragment(null, null, null, null));
    }

}