package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialParseTest {

    @Test
    public void initialParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialParse(new StringReader("<p>hello</p>"), "http://www.test.com", new Parser(builder));
        assertTrue(builder.stack.size() > 0);
    }

}