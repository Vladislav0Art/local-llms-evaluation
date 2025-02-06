package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEquals_ObjectIsDifferentReturnsFalse {

    @Mock
    private Pattern pattern;

    @Test
    public void equals_ObjectIsDifferentReturnsFalse() {
        AppVersion obj1 = new AppVersion();
        AppVersion obj2 = new AppVersion("different-value");
        assertFalse(obj1.equals(obj2));
    }

}