package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseWhenElementNotFoundTest {

    @Test
    public void popStackToCloseWhenElementNotFoundTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag("test-tag");
        int stackSizeBeforePop = xmlTreeBuilder.getStack().size();
        xmlTreeBuilder.popStackToClose(endTag);
        assertEquals(stackSizeBeforePop, xmlTreeBuilder.getStack().size());
    }

}