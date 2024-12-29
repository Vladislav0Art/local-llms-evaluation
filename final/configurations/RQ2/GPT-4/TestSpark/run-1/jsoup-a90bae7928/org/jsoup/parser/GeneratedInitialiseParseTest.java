package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() throws Exception {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Method initialiseParseMethod = TreeBuilder.class.getDeclaredMethod("initialiseParse", String.class, String.class, Parser.class);
        initialiseParseMethod.setAccessible(true);
        initialiseParseMethod.invoke(builder, "<foo></foo>", "http://base.uri", Parser.xmlParser());
        assertEquals("http://base.uri", builder.getBaseUri());
    }

}