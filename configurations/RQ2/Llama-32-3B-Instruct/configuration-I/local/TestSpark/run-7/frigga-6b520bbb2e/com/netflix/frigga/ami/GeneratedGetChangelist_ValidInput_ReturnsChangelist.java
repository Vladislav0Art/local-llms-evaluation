package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetChangelist_ValidInput_ReturnsChangelist {

    @Test
    public void getChangelist_ValidInput_ReturnsChangelist() {
        String amiName = "changelist-12345";
        String changelist = "changelist-12345";
        assertEquals(changelist, new AppVersion(amiName).getChangelist());
    }

}