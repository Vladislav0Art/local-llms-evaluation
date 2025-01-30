package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedWriteJsonIOExceptionTest {

    @Test
    public void writeJsonIOExceptionTest() throws IOException {
        Appendable out = Mockito.mock(Appendable.class);
        Mockito.doThrow(new IOException()).when(out).append('{');
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term", Mockito.mock(Noun.class));

        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>(map, false);
        testTerm.writeJson(out, provider, Mockito.mock(HumanLanguage.class), new HashSet<>(Collections.singletonList("term")));
    }

}