package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Doctype;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.*;

import java.io.StringReader;

public class GeneratedPopStackToCloseTest {

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        EndTag endTag = new EndTag();
        endTag.tagName = "test";
        builder.popStackToClose(endTag);
        assertFalse(builder.stack.contains("test"));
    }

}