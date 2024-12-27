package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedMarkInsertionMode {

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Mock
    private Parser parser;

    @Test
    public void markInsertionMode() {
        HtmlTreeBuilderState state = Mockito.mock(HtmlTreeBuilderState.class);
        when(state.isInsertionMode()).thenReturn(false);

        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        boolean result = htmlTreeBuilder.markInsertionMode(state);
        assertTrue(result);
    }

}