package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedConstructorDefaultTest {

    @Test
    public void constructorDefaultTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertFalse(map.isSkinny);
        Assert.assertTrue(map.isEmpty());
    }

}