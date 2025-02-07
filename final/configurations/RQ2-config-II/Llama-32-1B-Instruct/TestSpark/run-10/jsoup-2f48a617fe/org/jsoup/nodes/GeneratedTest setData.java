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

public class GeneratedTest setData {

    private ParseSettings settings = new ParseSettings();
    private Parser parser = new Parser(settings);

    @BeforeAll
    public static void setup() {
        settings.setParser(new StringReader("<!DOCTYPE html><html><body></body></html>"));
    }

    @Test
    public void test

    setData() throws IOException {
        Comment comment = new Comment("");
        comment.setData("");
        assertEquals("", comment.getData());
    }

    @Before
    public void setupMockParser() {
        parser.setParseOptions(new ParseOptions().setNamespace(true));
        mock(parser);
    }

    private void mock(Parser parser) {
        ParserScope scope = parser.getScope();
        Arrays.asList("parser", "mock").forEach((key, value) -> scope.put(key, value));
    }

}