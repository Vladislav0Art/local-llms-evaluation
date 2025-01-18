package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        HashMap<String, GrammaticalTermImpl> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTermImpl> impl = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(impl.isSkinny());
    }

}