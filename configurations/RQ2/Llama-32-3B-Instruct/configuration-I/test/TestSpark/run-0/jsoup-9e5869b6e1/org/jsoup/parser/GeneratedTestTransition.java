package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTransition {

    @Mock
    private TreeBuilder treeBuilder;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Reader reader;

    @Test
    public void testTransition() {
        when(treeBuilder.transition(Mockito.any(HtmlTreeBuilderState.class))).thenReturn(this);
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder(treeBuilder, parseSettings);
        htmlTreeBuilder.transition(null);
    }

}