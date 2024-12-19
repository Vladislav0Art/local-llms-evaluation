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

public class GeneratedTestGetWholeText {

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
    public void testGetWholeText() {
        TextNode result = new TextNode(this.text);
        List<String> expected = new ArrayList<>();
        expected.add("   Hello, World! ");
        assertThat(result.getWholeText(), is(expected));
    }

}