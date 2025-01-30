package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class GeneratedProcessDoctypeTagTest {

    @Test
    public void processDoctypeTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Doctype();
        token.asDoctype().nameAttr("doctype");
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

}