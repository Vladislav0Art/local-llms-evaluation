package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenStartTagTest {

    @Test
    public void processTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("root", new Attributes());
        boolean processed = xmlTreeBuilder.process(startTag);
        assertTrue(processed);
    }

}