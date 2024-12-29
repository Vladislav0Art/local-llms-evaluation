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

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() throws Exception {
        Constructor<XmlTreeBuilder> constructor = XmlTreeBuilder.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        XmlTreeBuilder newInstance = constructor.newInstance();
        assertEquals(XmlTreeBuilder.class, newInstance.getClass());
    }

}