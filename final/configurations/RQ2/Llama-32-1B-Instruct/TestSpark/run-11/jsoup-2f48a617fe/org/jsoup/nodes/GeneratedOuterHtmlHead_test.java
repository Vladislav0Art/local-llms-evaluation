package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedOuterHtmlHead_test {

    @Test
    public void outerHtmlHead_test() throws IOException {
        Document document = new Document();
        Parser parser = document.createParser(Parser.OUTPUT);
        outerHtmlHeadHead(parser, 0, null);
        assertEquals("", (String) getComment().outerHtmlHead(parser, 0, null).toCharArray());
    }

}