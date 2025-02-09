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

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Noun noun = mock(Noun.class);
        HashMap<String, Noun> map = new HashMap<String, Noun>();
        map.put("test", noun);
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Noun result = grammaticalTermMap.get("test");

        Assert.assertEquals(noun, result);
    }

}