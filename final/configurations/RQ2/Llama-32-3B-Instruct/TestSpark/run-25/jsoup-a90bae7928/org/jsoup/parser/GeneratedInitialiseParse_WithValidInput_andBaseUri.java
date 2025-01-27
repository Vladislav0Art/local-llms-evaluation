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

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitialiseParse_WithValidInput_andBaseUri {

    @Test
    public void initialiseParse_WithValidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root><child/></root>");
        builder.initialiseParse(reader, "https://example.com", null);
        assertNotNull(builder.parser());
    }

}