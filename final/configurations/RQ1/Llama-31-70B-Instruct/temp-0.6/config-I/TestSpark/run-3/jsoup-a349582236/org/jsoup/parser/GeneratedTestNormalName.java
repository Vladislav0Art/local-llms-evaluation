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
public class GeneratedTestNormalName {

    private Tag tagUnderTest;

    @Before
    public void setUp() {
        tagUnderTest = new Tag("");
    }

    /**
     * Tests the getName() method.
     */

    @Test
    public void testNormalName() {
        // Setup
        String expectedResult = "testNormalName";
        tagUnderTest.tagName = "TESTNORMALNAME";

        PowerMockito.mockStatic(Normalizer.class);
        when(Normalizer.lowerCase(tagUnderTest.tagName)).thenReturn(expectedResult);

        // Execute
        String result = tagUnderTest.normalName();

        // Verify
        assertEquals(expectedResult, result);
    }

}