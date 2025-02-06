package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedParserParser_test {

    @Test
    public void parserParser_test() {
        Parser parser = new Parser();
        Document document = Document.createShell("http://example.com").parser(parser);
        assertNotNull(document.parser());
        assertTrue(document.parser() == parser);
    }

}