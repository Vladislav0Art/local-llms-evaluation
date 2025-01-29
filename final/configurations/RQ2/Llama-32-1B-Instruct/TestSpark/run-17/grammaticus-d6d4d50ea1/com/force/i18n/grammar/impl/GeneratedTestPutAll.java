package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestPutAll {

    @Test
    public void testPutAll() {
        HumanLanguage language = new HumanLanguage();
        Set<T> expectedTerms = ImmutableMap.of("term1", "value1", "term2", "value2");
        Map<String, T> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, false);

        GrammaticalTerm termToPut = new GrammaticalTerm();
        instance.putAll(mock(GrammaticalTermMap.class));

        // Mocking the put method
        when(instance.put("term3", termToPut)).thenReturn(true);

        String actualName = "test-term";
        T actualTerm = instance.get(actualName);
        assert actualTerm == expectedTerms.get(actualName);
        assert actualTerm != null;
    }

}