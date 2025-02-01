package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test_key", "test_value");
        Assert.assertEquals("test_value", termMap.get("test_key"));
    }

}