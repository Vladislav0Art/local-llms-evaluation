package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestNullSafeStringComparator {

    private static final Pattern APP_VERSION_PATTERN = Pattern.compile(
            "([" + NameConstants.NAME_HYPHEN_CHARS
                    + "]+)-([0-9.a-zA-Z~]+)-(\\w+)(?:[.](\\w+))?(?:\\/([" + NameConstants.NAME_HYPHEN_CHARS + "]+)\\/([0-9]+))?");

    @Test
    public void testNullSafeStringComparator() {
        String one = null;
        String two = null;
        assertEquals(0, AppVersion.nullSafeStringComparator(one, two));

        one = "test";
        assertEquals(1, AppVersion.nullSafeStringComparator(one, two));

        two = "test";
        assertEquals(0, AppVersion.nullSafeStringComparator(one, two));

        one = null;
        assertEquals(-1, AppVersion.nullSafeStringComparator(one, two));
    }

}