package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTagToken = new Token.StartTag();
        startTagToken.nameAttr("tag");
        xmlTreeBuilder.insert(startTagToken);
        assertEquals(2, xmlTreeBuilder.stack.size());
    }

}