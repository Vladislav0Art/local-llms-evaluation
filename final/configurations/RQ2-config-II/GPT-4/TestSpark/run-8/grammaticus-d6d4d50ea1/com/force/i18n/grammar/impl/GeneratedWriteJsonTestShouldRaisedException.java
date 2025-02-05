package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedWriteJsonTestShouldRaisedException {

    @Test
    public void writeJsonTestShouldRaisedException() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>();
        grammaticalTermMapImpl.writeJson(null, mock(RenamingProvider.class), mock(LanguageDictionary.class), null);
    }

}