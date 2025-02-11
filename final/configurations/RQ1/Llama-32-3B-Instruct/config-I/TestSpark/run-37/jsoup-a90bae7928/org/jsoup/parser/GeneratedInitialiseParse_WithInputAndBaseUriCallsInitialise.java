package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.TextNode;

import java.io.Reader;
import java.util.List;

public class GeneratedInitialiseParse_WithInputAndBaseUriCallsInitialise {

    @Test
    public void initialiseParse_WithInputAndBaseUriCallsInitialise() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root>Hello World!</root>"), "", null);
        assertNotNull(builder.stack);
        assertNotNull(builder.doc.outputSettings());
    }

}