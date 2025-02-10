package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestProcessTokenStartTag {

    public String process(String input) {
        // implementation
        return "";
    }

    public void process(Token token) {
    }
}

public interface Token {
}

public abstract class AbstractToken implements Token {
}

public class TokenStartTag extends AbstractToken {
}

public class TreeBuilderMock {

    private String result;

    public TreeBuilderMock() {
    }

    public String process(String input) {
        result = input;
        return "";
    }

    public void process(Token token) {
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class XmlTreeBuilderTest {

    @Test
    public void testProcessTokenStartTag() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        TokenStartTag token = new TokenStartTag();
        assertTrue(treeBuilder.process(token));
    }
}

}