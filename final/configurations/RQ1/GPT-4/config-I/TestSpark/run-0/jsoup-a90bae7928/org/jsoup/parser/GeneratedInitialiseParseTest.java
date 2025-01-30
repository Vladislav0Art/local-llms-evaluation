package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() throws Exception {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "http://example.com";
        String input = "<doc><element /></doc>";
        Method method = TreeBuilder.class.getDeclaredMethod("initialiseParse", StringReader.class, String.class, Parser.class);
        method.setAccessible(true);

        method.invoke(xmlTreeBuilder, new StringReader(input), baseUri, Parser.xmlParser());

        assertEquals(1, xmlTreeBuilder.stack.size());
    }

}