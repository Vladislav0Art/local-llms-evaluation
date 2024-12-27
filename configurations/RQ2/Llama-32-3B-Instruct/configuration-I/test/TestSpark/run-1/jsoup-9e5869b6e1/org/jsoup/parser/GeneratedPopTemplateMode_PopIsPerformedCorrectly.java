package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPopTemplateMode_PopIsPerformedCorrectly {

    @Test
    public void popTemplateMode_PopIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        assertEquals(state, builder.popTemplateMode());
    }

}