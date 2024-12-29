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

public class GeneratedProcessTest {

    @Test
    public void processTest() throws Exception {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Method processMethod = TreeBuilder.class.getDeclaredMethod("process", Token.class);
        processMethod.setAccessible(true);
        TokenQueue tokenQueue = new TokenQueue("<p></p>");
        while (!tokenQueue.isEmpty()) {
            processMethod.invoke(builder, Parser.parseXmlDeclaration(tokenQueue, false));
        }
    }

}