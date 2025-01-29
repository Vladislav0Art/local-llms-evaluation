package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        // Mocking the containsKey method
        when(instance.containsKey("test-term")).thenReturn(true);

        assert instance.containsKey("test-term");
    }

}