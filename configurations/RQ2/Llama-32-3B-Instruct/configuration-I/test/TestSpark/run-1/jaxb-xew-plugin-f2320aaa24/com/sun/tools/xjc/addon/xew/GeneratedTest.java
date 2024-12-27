package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Mock
    private Outline outlineMock;

    public void testRunInternal_SucceedsWhenOutlineIsNotNull() throws Exception {
        when(outlineMock != null).thenReturn(true);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        boolean result = plugin.runInternal(outlineMock);
        assertTrue(result);
    }

}