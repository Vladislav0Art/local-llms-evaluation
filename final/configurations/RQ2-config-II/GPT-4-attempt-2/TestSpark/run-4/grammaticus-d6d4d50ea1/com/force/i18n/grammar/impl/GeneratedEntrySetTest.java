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

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        HashMap<String, Noun> map = new HashMap<String, Noun>();
        map.put("test", null);
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Set<Map.Entry<String, Noun>> entries = grammaticalTermMap.entrySet();

        Assert.assertEquals(1, entries.size());
    }

}