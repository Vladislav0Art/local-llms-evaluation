package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        HumanLanguage language = new HumanLanguage();
        Set<T> expectedTerms = ImmutableMap.of("term1", "value1", "term2", "value2");
        Map<String, T> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, false);

        String actualName = "test-term";
        T actualTerm = instance.get(actualName);
        assert actualTerm == expectedTerms.get(actualName);

        String actualKeySet = instance.keySet();
        Assert.assertTrue(actualKeySet.contains(actualName));
    }

}