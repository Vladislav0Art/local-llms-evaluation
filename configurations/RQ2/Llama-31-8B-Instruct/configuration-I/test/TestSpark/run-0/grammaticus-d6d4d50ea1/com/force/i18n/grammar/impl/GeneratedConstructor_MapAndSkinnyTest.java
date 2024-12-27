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

public class GeneratedConstructor_MapAndSkinnyTest {

    @Test
    public void constructor_MapAndSkinnyTest() {
        Map<String, String> map = new HashMap<>();
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, true);
        assertNotNull(instance);
    }

}