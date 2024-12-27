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

public class GeneratedTestTransitionState2 {

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
    public void testTransitionState2() {
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        when(state.next()).thenReturn("state1");
        assertFalse(builder.transition(state));
    }
}

public class Token {
    private String value;
    private String type;

    public Token(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}

public interface HtmlTreeBuilderState {
}

public class HtmlTreeBuilderState implements HtmlTreeBuilderState {
    private Node state;

    public void setState(Node state) {
        this.state = state;
    }

    @Override
    public String next() {
        return "";
    }
}

public class HtmlTreeBuilder {
    private Parser parser;
    private Element context;
    private BaseUri baseUri;

    public HtmlTreeBuilder() {
        this.parser = new Parser();
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void setContext(Element context) {
        this.context = context;
    }

    public void setBaseUri(BaseUri baseUri) {
        this.baseUri = baseUri;
    }

    public Element parseFragment(String fragment, Element context, String baseUrl, Parser parser) {
        return null;
    }

    public Element parseFragment(String fragment, Parser parser) {
        return null;
    }

    public void initialiseParse(Reader reader, String baseUrl, Parser parser) {
    }

    public BaseUri getBaseUri() {
        return baseUri;
    }

    public boolean process(Token token, HtmlTreeBuilderState state) {
        return false;
    }

    public boolean transition(HtmlTreeBuilderState state) {
        return false;
    }
}

}