package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetNonExistingKey {

    @Test
    public void getNonExistingKey() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertNull(map.get("non-existing-key"));
    }

}