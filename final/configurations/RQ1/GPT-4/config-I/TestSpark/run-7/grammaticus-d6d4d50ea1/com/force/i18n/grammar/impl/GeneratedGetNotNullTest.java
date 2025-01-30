package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetNotNullTest {

    @Test
    public void getNotNullTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
        assertEquals(gt, grammaticalTermMap.get("test"));
    }

}