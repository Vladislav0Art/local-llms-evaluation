package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedContainsKeyTrueTest {

    @Test
    public void containsKeyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
        assertTrue(grammaticalTermMap.containsKey("test"));
    }

}