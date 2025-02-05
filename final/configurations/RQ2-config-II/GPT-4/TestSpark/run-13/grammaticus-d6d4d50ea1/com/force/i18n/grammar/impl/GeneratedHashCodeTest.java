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
public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Map<String, GrammaticalTerm> grammaticalTermMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(grammaticalTermMap, false);

        assertNotNull(grammaticalTermMapImpl.hashCode());
    }

}