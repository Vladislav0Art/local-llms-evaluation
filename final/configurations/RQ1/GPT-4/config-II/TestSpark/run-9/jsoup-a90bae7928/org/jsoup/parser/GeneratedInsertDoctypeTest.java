package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("doctypeName");
        xmlTreeBuilder.insert(doctype);
    }

}