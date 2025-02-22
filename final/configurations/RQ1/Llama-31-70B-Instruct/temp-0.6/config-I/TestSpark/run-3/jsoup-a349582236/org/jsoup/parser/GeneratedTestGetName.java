package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedTestGetName {

    private Tag tagUnderTest;

    @Before
    public void setUp() {
        tagUnderTest = new Tag("");
    }

    /**
     * Tests the getName() method.
     */

    @Test
    public void testGetName() {
        // Setup
        String expectedResult = "testTagName";
        tagUnderTest.tagName = expectedResult;

        // Execute
        String result = tagUnderTest.getName();

        // Verify
        assertEquals(expectedResult, result);
    }

}