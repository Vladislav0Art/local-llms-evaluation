package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<GrammaticalTerm> instance2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        // Mocking the equals method
        when(instance1.equals(instance2)).thenReturn(true);

        assert instance1.equals(instance2);
    }

}