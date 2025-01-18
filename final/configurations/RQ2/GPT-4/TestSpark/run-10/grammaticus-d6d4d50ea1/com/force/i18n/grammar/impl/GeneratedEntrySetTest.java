package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("Test", noun);

        Set<Map.Entry<String, Noun>> entries = map.entrySet();
        for (Map.Entry<String, Noun> entry : entries) {
            assertEquals("Key should be 'Test'", "Test", entry.getKey());
            assertEquals("Value should be the given noun", noun, entry.getValue());
        }
    }

}