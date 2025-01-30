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

public class GeneratedTest {

    static Noun nounExample = mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};
    static HumanLanguage language = mock(HumanLanguage.class);

    @Test
    public void equalsTestForEquality() {
        GrammaticalTermMapImpl<GrammaticalTerm> firstMapImpl = new GrammaticalTermMapImpl<>(mapExample, true);
        GrammaticalTermMapImpl<GrammaticalTerm> secondMapImpl = new GrammaticalTermMapImpl<>(mapExample, true);

        Assert.assertEquals(firstMapImpl, secondMapImpl);
    }

    @Test
    public void equalsTestForInequality() {
        GrammaticalTermMapImpl<GrammaticalTerm> firstMapImpl = new GrammaticalTermMapImpl<>(mapExample, true);
        GrammaticalTermMapImpl<GrammaticalTerm> secondMapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertNotEquals(firstMapImpl, secondMapImpl);
    }

    @Test
    public void hashCodeTestForNonSkinny() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertEquals(mapExample.hashCode(), mapImpl.hashCode());
    }

    @Test
    public void hashCodeTestForSkinny() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, true);

        Assert.assertEquals(mapExample.hashCode() + 37, mapImpl.hashCode());
    }

    @Test
    public void isSkinnyTestTrue() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, true);

        Assert.assertTrue(mapImpl.isSkinny());
    }

    @Test
    public void isSkinnyTestFalse() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertFalse(mapImpl.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        GrammaticalTermMap<GrammaticalTerm> skinnyVersion = mapImpl.makeSkinny();

        Assert.assertTrue(skinnyVersion.isSkinny());
        Assert.assertEquals(skinnyVersion, mapImpl);
    }

    @Test
    public void writeJsonTestWithTermsToInclude() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);
        StringBuilder output = new StringBuilder();
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        when(dictionary.getLanguage()).thenReturn(language);

        mapImpl.writeJson(output, mock(RenamingProvider.class), dictionary, mapExample.keySet());

        verify(nounExample).toJson(output);
    }

    @Test
    public void writeJsonTestWithoutTermsToInclude() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);
        StringBuilder output = new StringBuilder();
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        when(dictionary.getLanguage()).thenReturn(language);

        mapImpl.writeJson(output, mock(RenamingProvider.class), dictionary, null);

        verify(nounExample).toJson(output);
    }

    @Test
    public void getTestExistKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertEquals(nounExample, mapImpl.get("JohnDoe"));
    }

    @Test
    public void getTestNonExistKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertNull(mapImpl.get("JaneDoe"));
    }

    @Test
    public void containsKeyTestExistKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertTrue(mapImpl.containsKey("JohnDoe"));
    }

    @Test
    public void containsKeyTestNonExistKey() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertFalse(mapImpl.containsKey("JaneDoe"));
    }

    @Test
    public void putTestModifiable() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        mapImpl.put("JaneDoe", nounExample);

        Assert.assertTrue(mapImpl.containsKey("JaneDoe"));
    }

    @Test
    public void putTestNonModifiable() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, true);

        mapImpl.put("JaneDoe", nounExample);
    }

    @Test
    public void isEmptyTestNonEmpty() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertFalse(mapImpl.isEmpty());
    }

    @Test
    public void isEmptyTestEmpty() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Assert.assertTrue(mapImpl.isEmpty());
    }

}