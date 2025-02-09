package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.process(new Token.StartTag("test"));
        assertTrue(result);
    }

}