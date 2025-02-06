package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedParser {

    @Test
    public void parser() {
        Parser expectedParser = mock(Parser.class);
        Document document = new Document("");
        Parser actualParser = document.parser(expectedParser);
        assertThat(actualParser, is(expectedParser));
    }
}

public class MockConnection implements Connection {
    private String uri;

    public MockConnection(String uri) {
        this.uri = uri;
    }

    @Override
    public String getUri() {
        return uri;
    }
}

class MockFormElement extends Element {
    @Override
    public boolean tagName(String name) {
        return true;
    }
}

}