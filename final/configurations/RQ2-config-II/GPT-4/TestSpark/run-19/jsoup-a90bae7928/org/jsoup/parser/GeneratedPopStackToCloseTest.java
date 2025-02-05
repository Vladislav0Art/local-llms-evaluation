package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTagToken = new Token.EndTag();
        endTagToken.tagName("body");
        builder.popStackToClose(endTagToken);
        assertFalse(builder.stack.contains(endTagToken));
    }

}