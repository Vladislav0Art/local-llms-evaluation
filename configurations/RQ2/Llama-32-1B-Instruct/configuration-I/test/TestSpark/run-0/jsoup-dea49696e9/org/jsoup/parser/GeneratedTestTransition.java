package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedTestTransition {

    @Test
    public void testTransition() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        builder.transition(builder.state());

        String expected = "<p>Transitioned</p>";
        assertEquals(expected, builder.state().getText());
    }

}