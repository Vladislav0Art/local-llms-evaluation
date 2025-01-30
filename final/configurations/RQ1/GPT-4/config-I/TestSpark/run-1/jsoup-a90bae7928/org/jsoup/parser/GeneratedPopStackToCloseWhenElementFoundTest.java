package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public class GeneratedPopStackToCloseWhenElementFoundTest {

    @Test
    public void popStackToCloseWhenElementFoundTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.StartTag("test-tag"));
        Token.EndTag endTag = new Token.EndTag("test-tag");
        int stackSizeBeforePop = xmlTreeBuilder.getStack().size();
        xmlTreeBuilder.popStackToClose(endTag);
        assertEquals(stackSizeBeforePop - 1, xmlTreeBuilder.getStack().size());
    }

}