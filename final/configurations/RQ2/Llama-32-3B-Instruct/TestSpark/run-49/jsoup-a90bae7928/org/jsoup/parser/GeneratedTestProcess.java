package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestProcess {

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
    public void testProcess() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String xml = "<tag><subtag>subtext</subtag></tag>";
        assertEquals("<tag><subtag>subtext</subtag></tag>", treeBuilder.process(xml));
    }

}