package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestProcessString {

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
    public void testProcessString() {
        TreeBuilderMock treeBuilderMock = new TreeBuilderMock();
        String xml = "<tag><subtag>subtext</subtag></tag>";
        assertEquals(xml, treeBuilderMock.process(xml));
    }

}