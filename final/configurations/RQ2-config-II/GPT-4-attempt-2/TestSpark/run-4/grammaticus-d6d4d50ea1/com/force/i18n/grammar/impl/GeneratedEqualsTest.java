package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<Noun> original = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> compared = new GrammaticalTermMapImpl<>();

        Assert.assertEquals(original, compared);
    }

}