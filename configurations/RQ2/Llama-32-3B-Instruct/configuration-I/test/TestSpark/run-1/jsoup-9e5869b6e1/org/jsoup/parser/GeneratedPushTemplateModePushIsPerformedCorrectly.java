package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPushTemplateModePushIsPerformedCorrectly {

    @Test
    public void pushTemplateModePushIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        builder.pushTemplateMode(state);
        assertNotNull(builder.currentTemplateMode());
    }

}