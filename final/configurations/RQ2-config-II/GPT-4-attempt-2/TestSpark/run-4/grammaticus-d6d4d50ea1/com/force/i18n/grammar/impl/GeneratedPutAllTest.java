package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        Noun noun = mock(Noun.class);

        grammaticalTermMap2.put("test", noun);
        grammaticalTermMap1.putAll(grammaticalTermMap2);

        Assert.assertEquals(noun, grammaticalTermMap1.get("test"));
    }

}