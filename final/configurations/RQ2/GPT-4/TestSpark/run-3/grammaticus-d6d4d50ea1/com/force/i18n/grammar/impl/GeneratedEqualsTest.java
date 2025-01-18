package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        HashMap<String, GrammaticalTermImpl> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTermImpl> impl1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTermImpl> impl2 = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(impl1.equals(impl2));
    }

}