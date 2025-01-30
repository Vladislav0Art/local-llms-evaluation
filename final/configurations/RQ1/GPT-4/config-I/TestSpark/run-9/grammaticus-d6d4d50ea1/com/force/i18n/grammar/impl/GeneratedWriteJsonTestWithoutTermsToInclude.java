package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTestWithoutTermsToInclude {

    static Noun nounExample = mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};
    static HumanLanguage language = mock(HumanLanguage.class);

    @Test
    public void writeJsonTestWithoutTermsToInclude() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);
        StringBuilder output = new StringBuilder();
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        when(dictionary.getLanguage()).thenReturn(language);

        mapImpl.writeJson(output, mock(RenamingProvider.class), dictionary, null);

        verify(nounExample).toJson(output);
    }

}