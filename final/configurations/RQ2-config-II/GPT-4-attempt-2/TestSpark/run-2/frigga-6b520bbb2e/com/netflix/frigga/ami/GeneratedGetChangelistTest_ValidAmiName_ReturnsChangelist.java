package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetChangelistTest_ValidAmiName_ReturnsChangelist {

    @Test
    public void getChangelistTest_ValidAmiName_ReturnsChangelist() {
        AppVersion appVersion = AppVersion.parseName("validAmiName");
        assertNotNull("Expected a changelist", appVersion.getChangelist());
    }

}