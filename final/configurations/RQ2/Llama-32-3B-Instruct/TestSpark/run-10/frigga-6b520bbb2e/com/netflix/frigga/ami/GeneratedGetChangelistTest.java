package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.netflix.frigga.NameConstants;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetChangelistTest {

    @Test
    public void getChangelistTest() {
        @Deprecated
        String changelist = AppVersion.getChangelist();
        assertNull(changelist);
    }

}