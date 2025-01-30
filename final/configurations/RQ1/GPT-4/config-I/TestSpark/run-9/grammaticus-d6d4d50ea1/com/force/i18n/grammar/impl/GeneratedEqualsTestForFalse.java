package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEqualsTestForFalse {

    static Noun nounExample = Mockito.mock(Noun.class);
    static Map<String, GrammaticalTerm> mapExample = new HashMap<String, GrammaticalTerm>() {{
        put("JohnDoe", nounExample);
    }};

    @Test
    public void equalsTestForFalse() {
        GrammaticalTermMapImpl<GrammaticalTerm> firstMapImpl = new GrammaticalTermMapImpl<>(mapExample, true);
        GrammaticalTermMapImpl<GrammaticalTerm> secondMapImpl = new GrammaticalTermMapImpl<>(mapExample, false);

        Assert.assertFalse(firstMapImpl.equals(secondMapImpl));
    }

}