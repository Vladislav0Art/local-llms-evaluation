package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedInitialiseParseNullParserTest {

    @Test
    public void initialiseParseNullParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<node>test</node>");

        builder.initialiseParse(reader, "http://base.uri", null);
    }

}