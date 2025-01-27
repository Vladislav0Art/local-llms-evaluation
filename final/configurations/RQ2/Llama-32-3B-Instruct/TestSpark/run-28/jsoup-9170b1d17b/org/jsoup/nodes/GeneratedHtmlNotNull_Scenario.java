package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedHtmlNotNull_Scenario {

    @Test
    public void htmlNotNull_Scenario() throws Exception {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Appendable accum = new java.io.StringWriter();
        Document.OutputSettings out = new Document.OutputSettings();
        attrs.html(accum, out);
        String expected = "<span key=\"key\">value</span>";
        assertEquals(expected, accum.toString());
    }

}