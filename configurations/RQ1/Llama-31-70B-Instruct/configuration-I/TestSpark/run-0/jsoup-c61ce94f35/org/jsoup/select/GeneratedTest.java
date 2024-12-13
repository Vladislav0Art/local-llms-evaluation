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

public class GeneratedTest {

    @Mock
    private Evaluator evaluator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testRootEvaluator() {
        Element root = new Element("root");
        Element element = new Element("element");

        when(evaluator.matches(root, element)).thenReturn(true);

        StructuralEvaluator.Root rootEvaluator = new StructuralEvaluator.Root(evaluator);

        assertTrue(rootEvaluator.matches(root, root));
        assertFalse(rootEvaluator.matches(root, element));
    }

    @Test
    public void testHasEvaluator() {
        Element root = new Element("root");
        Element element = new Element("element");

        when(evaluator.matches(root, element)).thenReturn(true);

        StructuralEvaluator.Has hasEvaluator = new StructuralEvaluator.Has(evaluator);

        assertTrue(hasEvaluator.matches(root, element));
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