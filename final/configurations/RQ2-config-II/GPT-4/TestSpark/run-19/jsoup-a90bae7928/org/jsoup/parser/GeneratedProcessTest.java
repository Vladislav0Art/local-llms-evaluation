package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName("tag");
        assertTrue(builder.process(endTag));
    }

}