package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestParseFragmentWithoutContext {

    public static class Parser {
        private List<Node> parsedList;

        public void setParsedList(List<Node> parsedList) {
            this.parsedList = parsedList;
        }

        public List<Node> parse(String input) {
            return parsedList;
        }
    }

    public interface Node {
    }

    @Mock
    private Parser parser;

    @Mock
    private Element context;

    @Mock
    private Reader input;

    public HtmlTreeBuilderTest() {
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * [parseFragment][WithContext]Test
     */

    @Test
    public void testParseFragmentWithoutContext() {
        List<Node> expectedResult = new ArrayList<>();
        parser.setParsedList(expectedResult);
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element result = builder.parseFragment("", parser);
        assertNotNull(result);
    }

}