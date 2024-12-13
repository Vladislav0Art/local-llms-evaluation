package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTestNotEvaluator {

    @Mock
    private Evaluator evaluator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testNotEvaluator() {
        Element root = new Element("root");
        Element element = new Element("element");

        when(evaluator.matches(root, element)).thenReturn(true);

        StructuralEvaluator.Not notEvaluator = new StructuralEvaluator.Not(evaluator);

        assertFalse(notEvaluator.matches(root, element));
    }

}