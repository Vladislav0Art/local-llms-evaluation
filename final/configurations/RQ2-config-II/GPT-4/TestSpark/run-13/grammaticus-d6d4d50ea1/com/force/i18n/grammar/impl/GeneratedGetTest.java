package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.*;
import com.force.i18n.grammar.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTest {

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTerm grammaticalTerm = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", grammaticalTerm);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertEquals(grammaticalTerm, grammaticalTermMapImpl.get("test"));
    }

}