package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutToSkinnyTest {

    @Test
    public void putToSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        grammaticalTermMap.put("test", gt);
    }

}