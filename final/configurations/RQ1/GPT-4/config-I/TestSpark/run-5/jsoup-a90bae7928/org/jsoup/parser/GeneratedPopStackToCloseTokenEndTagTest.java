package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedPopStackToCloseTokenEndTagTest {

    @Test
    public void popStackToCloseTokenEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.parse("<tag>content</tag>", "");
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName("tag");
        xmlTreeBuilder.popStackToClose(endTag);
    }

}