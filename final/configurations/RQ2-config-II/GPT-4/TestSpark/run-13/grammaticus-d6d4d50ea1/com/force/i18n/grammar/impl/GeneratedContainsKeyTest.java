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
public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        grammaticalTermMap.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertTrue(grammaticalTermMapImpl.containsKey("test"));
    }

}