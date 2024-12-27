package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGenerateImpliedEndTagsTest {

    @Test
    public void generateImpliedEndTagsTest() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        htmlTreeBuilder.insertStartTag("p"); // push p element to stack
        htmlTreeBuilder.generateImpliedEndTags();

        assertNull(htmlTreeBuilder.getFromStack("p")); // p should be popped from stack
    }

}