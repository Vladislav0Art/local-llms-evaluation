package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;
import java.util.*;

public class GeneratedTest {

    @Test
    public void equalsEqualityTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(termMap, termMap);
    }

    @Test
    public void equalsNegativeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotEquals(termMap, new Integer(3));
    }

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(termMap.isSkinny());
    }

    @Test
    public void isSkinnyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void getUndefinedTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNull(termMap.get("undefined"));
    }

    @Test
    public void containsKeyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(termMap.containsKey("undefined"));
    }

    @Test
    public void isEmptyTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
    }

    @Test
    public void putSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.makeSkinny().put("test", Mockito.mock(GrammaticalTerm.class));
    }

    @Test
    public void putAllSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.makeSkinny().putAll(new GrammaticalTermMapImpl<>());
    }

    @Test
    public void writeJsonWithTermsTest() throws IOException {
        StringWriter writer = new StringWriter();
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>();
        termsToInclude.add("term");

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(writer, provider, dictionary, termsToInclude);

        Assert.assertEquals("{}", writer.toString());
    }

    @Test
    public void writeJsonWithoutTermsTest() throws IOException {
        StringWriter writer = new StringWriter();
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(writer, provider, dictionary, null);

        Assert.assertEquals("{}", writer.toString());
    }

}