package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Mock
    private TreeBuilder treeBuilderMock;

    @Mock
    private ParseSettings parseSettingsMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Reader inputReaderMock;

    @Mock
    private Element elementMock;

    public static class Token {
        public int type;
        public String value;

        public Token(int type, String value) {
            this.type = type;
            this.value = value;
        }
    }

    public static class HtmlTreeBuilderState {
        public Node node;
    }

}