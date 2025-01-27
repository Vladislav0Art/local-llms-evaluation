package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.helper.Validate;

public class GeneratedInsertDoctype_GivenDoctypeToken_ReturnsInsertedDoctype {

    @Test
    public void insertDoctype_GivenDoctypeToken_ReturnsInsertedDoctype() {
        Token.Doctype token = new Token.Doctype("child");
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        DocumentType insertedDoctype = treeBuilder.insert(token);
        assertNotNull(insertedDoctype);
        assertEquals("child", insertedDoctype.name());
    }

}