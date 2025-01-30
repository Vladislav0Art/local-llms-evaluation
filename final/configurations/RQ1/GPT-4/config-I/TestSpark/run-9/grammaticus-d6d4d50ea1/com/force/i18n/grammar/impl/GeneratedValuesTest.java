package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.GrammaticalTermMap;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedValuesTest {

    static Noun nounExample = Mockito.mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Collection<GrammaticalTerm> result = mapImpl.values();

        Assert.assertEquals(mapExample.values(), result);
    }

}