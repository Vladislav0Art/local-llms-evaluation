package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.mockito.Mockito.mock;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTerm = mock(GrammaticalTerm.class);
        other.put("key", grammaticalTerm);
        grammaticalTermMap.putAll(other);
        Assert.assertTrue(grammaticalTermMap.containsKey("key"));
    }

}