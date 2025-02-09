package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tag("div");
        xmlTreeBuilder.insert(startTag);
        assertEquals("div", xmlTreeBuilder.getStack().getFirst().nodeName());
    }

}