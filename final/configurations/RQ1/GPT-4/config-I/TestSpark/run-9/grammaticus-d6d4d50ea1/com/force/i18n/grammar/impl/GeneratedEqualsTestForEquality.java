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

public class GeneratedEqualsTestForEquality {

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

}