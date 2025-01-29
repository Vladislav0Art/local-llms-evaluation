package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.settings.IniFileUtil;
import io.json.gson.Gson;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsSkinny {

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        // Mocking the isSkinny method
        when(instance.isSkinny()).thenReturn(true);

        assert instance.isSkinny();
    }

}