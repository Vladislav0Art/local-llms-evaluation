package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        TesterXmlTreeBuilder builder = new TesterXmlTreeBuilder();
        StringReader reader = new StringReader("<root>");
        Parser parser = Parser.xmlParser();
        builder.runInitialiseParse(reader, "", parser);
        reader.close();
    }

}