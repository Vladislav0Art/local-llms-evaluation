package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class GeneratedInsertTokenEndTagTest {

    @Test
    public void insertTokenEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<tag>content</tag>", "");
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("tag");
        xmlTreeBuilder.popStackToClose(endTag);
    }

}