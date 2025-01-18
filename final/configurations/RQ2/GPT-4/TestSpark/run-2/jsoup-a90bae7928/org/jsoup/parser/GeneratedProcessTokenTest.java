package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedProcessTokenTest {

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();

        token.name("test");
        boolean result = builder.process(token);
        assertTrue(result);
    }

}