package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertEquals(map.map.hashCode(), map.hashCode());
    }

}