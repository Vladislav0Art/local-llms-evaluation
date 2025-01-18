package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    // Test the default constructor

    @Test
    public void hashCodeTest() {
        Map<String, HumanLanguage> map = new HashMap<>();
        map.put("English", HumanLanguage.ENGLISH);
        GrammaticalTermMapImpl mapImpl = new GrammaticalTermMapImpl(map, true);
        assertNotNull(mapImpl.hashCode());
    }

}