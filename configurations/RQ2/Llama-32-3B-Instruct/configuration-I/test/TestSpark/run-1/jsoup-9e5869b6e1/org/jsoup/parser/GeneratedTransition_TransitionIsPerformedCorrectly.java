package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTransition_TransitionIsPerformedCorrectly {

    @Test
    public void transition_TransitionIsPerformedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        HtmlTreeBuilderState state = new HtmlTreeBuilderState();
        builder.transition(state);
        assertNotNull(builder.state());
    }

}