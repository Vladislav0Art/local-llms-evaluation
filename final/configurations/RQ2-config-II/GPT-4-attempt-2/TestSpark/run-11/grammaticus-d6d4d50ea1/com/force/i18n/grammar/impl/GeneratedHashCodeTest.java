package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<Object> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(grammaticalTermMap.hashCode());
    }

}