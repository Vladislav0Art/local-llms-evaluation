package com.netflix.frigga.ami;

import com.netflix.frigga.ami.AppVersion;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Generated[AppVersion][Scenario]

TestGetChangelist {

    @Test
    public void [AppVersion][Scenario]TestGetChangelist() {
        AppVersion appVersion = AppVersion.parseName("ami-name");
        List<String> changelist = appVersion.getChangelist();
        assertEquals(List.of("changelist-1"), changelist); // should be "changelist-1"
    }

}