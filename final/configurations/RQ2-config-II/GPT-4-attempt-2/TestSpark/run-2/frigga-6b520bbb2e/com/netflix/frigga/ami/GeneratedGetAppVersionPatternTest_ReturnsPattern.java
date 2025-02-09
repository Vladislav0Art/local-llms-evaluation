package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;
import com.netflix.frigga.ami.AppVersion;

public class GeneratedGetAppVersionPatternTest_ReturnsPattern {

    @Test
    public void getAppVersionPatternTest_ReturnsPattern() {
        assertNotNull("Expected a Pattern object", AppVersion.getAppVersionPattern());
    }

}