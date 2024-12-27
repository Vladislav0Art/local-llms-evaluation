package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

public class GeneratedMakeSkinny_SkinnyTest {

    @Test
    public void makeSkinny_SkinnyTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<String> skinnyInstance = instance.makeSkinny();
        assertTrue(skinnyInstance.isSkinny());
    }

}