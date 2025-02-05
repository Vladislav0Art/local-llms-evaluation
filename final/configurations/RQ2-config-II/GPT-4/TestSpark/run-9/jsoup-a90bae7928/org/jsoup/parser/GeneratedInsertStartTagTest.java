package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("test");
        assertNotNull(parser.insert(startTag));
    }

}