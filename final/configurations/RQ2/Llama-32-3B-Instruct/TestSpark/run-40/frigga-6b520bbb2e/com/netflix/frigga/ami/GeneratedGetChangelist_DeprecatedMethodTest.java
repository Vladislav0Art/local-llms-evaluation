package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

public class GeneratedGetChangelist_DeprecatedMethodTest {

    @Test
    public void getChangelist_DeprecatedMethodTest() {
        @Deprecated
        String changelist = AppVersion.class.getDeclaredMethod("getChangelist").invoke(null);
        assertNotNull(changelist);
    }

}