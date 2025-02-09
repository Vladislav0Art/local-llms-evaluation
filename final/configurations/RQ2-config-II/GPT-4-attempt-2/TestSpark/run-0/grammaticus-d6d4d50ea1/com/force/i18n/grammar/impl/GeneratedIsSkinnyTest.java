package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(map.isSkinny());
    }

}