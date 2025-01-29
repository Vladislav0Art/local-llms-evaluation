package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.util.function.Supplier;

public class GeneratedOuterHtmlTail_test {

    @Test
    public void outerHtmlTail_test() throws IOException {
        Document document = new Document();
        Parser parser = document.createParser(Parser.OUTPUT);
        outerHtmlTailTail(parser, 1, null);
        assertEquals("", (String) getComment().outerHtmlTail(parser, 1, null).toCharArray());
    }

}