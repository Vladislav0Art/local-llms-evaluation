package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertEndTagTest {

    @Test
    public void insertEndTagTest() {
        Token.EndTag tag = new Token.EndTag("test");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.stack.add(builder.doc.createElement("test"));
        builder.process(tag);
        assertTrue(builder.stack.isEmpty());
    }

}