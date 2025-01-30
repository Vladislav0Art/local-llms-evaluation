package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedInsertTokenStartTagTest {

    @Test
    public void InsertTokenStartTagTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        StartTag startTag = new StartTag("test");
        testObject.insert(new Token(startTag));
        assertEquals("test", testObject.getCurrentElement().childNode(0).nodeName());
    }

}