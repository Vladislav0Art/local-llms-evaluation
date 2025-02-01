package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedWriteJsonTermProviderNullTest {

    @Test
    public void writeJsonTermProviderNullTest() throws IOException {
        Appendable out = new StringBuilder();
        Noun noun = Mockito.mock(Noun.class);
        Mockito.when(noun.getName()).thenReturn("noun");
        Mockito.doNothing().when(noun).toJson(out);

        RenamingProvider provider = null;

        HumanLanguage language = Mockito.mock(HumanLanguage.class);
        grammaticalTermMapImpl.writeJsonTerm(out, provider, noun, language);

        assertEquals("\"noun\":", out.toString());
    }

}