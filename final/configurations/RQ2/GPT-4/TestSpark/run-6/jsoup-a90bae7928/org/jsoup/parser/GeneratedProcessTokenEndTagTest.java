package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTokenEndTagTest {

    @Test
    public void processTokenEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("root");
        boolean processed = xmlTreeBuilder.process(endTag);
        assertTrue(processed);
    }

}