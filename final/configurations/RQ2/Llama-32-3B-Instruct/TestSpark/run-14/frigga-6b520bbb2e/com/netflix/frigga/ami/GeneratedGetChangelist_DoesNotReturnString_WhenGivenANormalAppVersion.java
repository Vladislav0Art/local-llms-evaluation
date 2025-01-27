package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.netflix.frigga.NameConstants;
import org.mockito.Mockito;

public class GeneratedGetChangelist_DoesNotReturnString_WhenGivenANormalAppVersion {

    @Test
    public void getChangelist_DoesNotReturnString_WhenGivenANormalAppVersion() {
        String changelist = AppVersion.parseName("1.2.3-4").getChangelist();
        assertNull(changelist);
    }

}