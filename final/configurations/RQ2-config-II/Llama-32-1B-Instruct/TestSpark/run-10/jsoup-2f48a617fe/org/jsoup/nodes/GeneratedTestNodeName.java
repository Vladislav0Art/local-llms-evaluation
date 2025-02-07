package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserScope;
import org.jsoup.parser.ParserScopeLevel;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedTestNodeName {

    private ParseSettings settings = new ParseSettings();
    private Parser parser = new Parser(settings);

    @BeforeAll
    public static void setup() {
        settings.setParser(new StringReader("<!DOCTYPE html><html><body></body></html>"));
    }

    @Test
    public void testNodeName() throws IOException {
        Comment comment = new Comment("<!xml version=\"1.0\" encoding=\"UTF-8\"?><!-- -->");
        assertEquals("Comment", comment.nodeName());
    }

}