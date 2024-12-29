package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetChangelist_Devprecated_ReturnsChangelist {

    @Test
    public void getChangelist_Devprecated_ReturnsChangelist() {
        @Deprecated
        AppVersion appVersion = new AppVersion("changelist-123");
        assertNotNull(appVersion.getChangelist());
    }

}