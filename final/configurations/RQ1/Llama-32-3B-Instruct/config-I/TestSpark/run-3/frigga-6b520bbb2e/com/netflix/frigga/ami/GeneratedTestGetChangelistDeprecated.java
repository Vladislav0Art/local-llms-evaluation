package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestGetChangelistDeprecated {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void testGetChangelistDeprecated() {
        AppVersion parsedName = AppVersion.parseName(amiName);
        assertNotNull(parsedName.getChangelist());
        assertEquals(parsedName.getCommit(), parsedName.getChangelist());
    }

}