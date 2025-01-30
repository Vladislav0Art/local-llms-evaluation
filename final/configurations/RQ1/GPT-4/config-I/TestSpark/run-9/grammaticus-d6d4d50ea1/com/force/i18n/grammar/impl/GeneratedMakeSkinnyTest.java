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

public class GeneratedMakeSkinnyTest {

    static Noun nounExample = mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};
    static HumanLanguage language = mock(HumanLanguage.class);

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        GrammaticalTermMap<GrammaticalTerm> skinnyVersion = mapImpl.makeSkinny();

        Assert.assertTrue(skinnyVersion.isSkinny());
        Assert.assertEquals(skinnyVersion, mapImpl);
    }

}