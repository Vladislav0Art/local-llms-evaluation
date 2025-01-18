package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        HashMap<String, GrammaticalTermImpl> map = new HashMap<>();
        GrammaticalTermImpl term = mock(GrammaticalTermImpl.class);
        map.put("key", term);
        GrammaticalTermMapImpl<GrammaticalTermImpl> impl = new GrammaticalTermMapImpl<>(map, false);
        RenamingProvider provider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new ArrayList<>();
        termsToInclude.add("key");
        impl.writeJson(new StringBuilder(), provider, dictionary, termsToInclude);
    }
}

class GrammaticalTermImpl implements GrammaticalTerm {
    @Override
    public String getKey() {
        return null;
    }

}