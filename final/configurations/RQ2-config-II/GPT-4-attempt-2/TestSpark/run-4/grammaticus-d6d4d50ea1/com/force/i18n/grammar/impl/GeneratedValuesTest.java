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

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        Noun noun = mock(Noun.class);
        HashMap<String, Noun> map = new HashMap<String, Noun>();
        map.put("test", noun);
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Collection<Noun> values = grammaticalTermMap.values();

        Assert.assertEquals(1, values.size());
        Assert.assertEquals(noun, values.iterator().next());
    }

}