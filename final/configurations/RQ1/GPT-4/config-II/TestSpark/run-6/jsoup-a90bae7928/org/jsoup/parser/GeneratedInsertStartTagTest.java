package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("TagName");
        startTag.setSelfClosing();

        Element element = xmlTreeBuilder.insert(startTag);
        assertEquals("TagName", element.nodeName());
    }

}