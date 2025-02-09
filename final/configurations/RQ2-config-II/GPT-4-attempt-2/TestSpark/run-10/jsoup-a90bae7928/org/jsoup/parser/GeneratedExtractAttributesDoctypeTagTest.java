package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedExtractAttributesDoctypeTagTest {

    @Test
    public void extractAttributesDoctypeTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.init("html", "publicId", "systemId", true);
        xmlTreeBuilder.insert(doctypeToken);
        Assert.assertEquals("html", ((DocumentType) xmlTreeBuilder.getStack().get(1)).name());
    }

}