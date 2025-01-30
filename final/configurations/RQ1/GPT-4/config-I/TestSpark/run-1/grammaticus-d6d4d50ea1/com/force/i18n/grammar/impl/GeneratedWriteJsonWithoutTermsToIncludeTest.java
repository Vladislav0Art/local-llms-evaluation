package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedWriteJsonWithoutTermsToIncludeTest {

    @Test
    public void writeJsonWithoutTermsToIncludeTest() throws IOException {
        Appendable appendable = Mockito.mock(Appendable.class);
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        HumanLanguage lang = Mockito.mock(HumanLanguage.class);
        Mockito.when(provider.getRenamedNoun(Mockito.any(), Mockito.any())).thenReturn(Mockito.mock(Noun.class));
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("testTerm", Mockito.mock(GrammaticalTerm.class));

        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>(map, false);
        testTerm.writeJson(appendable, provider, lang);
        Mockito.verify(appendable, Mockito.times(1)).append('{');
        Mockito.verify(appendable, Mockito.times(1)).append('}');
    }

}