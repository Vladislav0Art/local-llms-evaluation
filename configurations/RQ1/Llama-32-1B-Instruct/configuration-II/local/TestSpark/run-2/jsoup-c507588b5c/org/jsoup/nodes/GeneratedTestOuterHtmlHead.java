package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTestOuterHtmlHead {

    private Document document;
    private Appendable accum;
    private int depth = 0;
    private String text = "";

    public void setUp() {
        this.document = new Document();
        this.accum = new StringBuilder();
        this.depth = 0;
        this.text = "   Hello, World! ";
    }

    /**
     * Test if this text node is blank -- that is, empty or only whitespace (including newlines).
     */

    @Test
    public void testOuterHtmlHead() {
        TextNode result = new TextNode(this.text).outerHtmlHead(null, 0, null);
        List<String> expected = new ArrayList<>();
        assertThat(expected, is(new String[]{"<div><p>Hello</p></div>}"));
	}

    }