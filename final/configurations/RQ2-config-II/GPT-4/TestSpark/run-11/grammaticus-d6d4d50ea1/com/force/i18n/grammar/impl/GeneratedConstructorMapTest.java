package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructorMapTest {

    @Mock
    GrammaticalTerm grammaticalTermMock;

    @Test
    public void constructorMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", grammaticalTermMock);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(mapImpl.containsKey("test"));
    }

}