package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInsertDoctypeTest {

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Doctype());
        Assert.assertTrue(builder.stack.get(0).childNode(0) instanceof DocumentType);
    }

}