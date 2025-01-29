package com.netflix.frigga.ami;

import com.netflix.frigga.Ami;
import com.netflix.frigga.AppVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneratedTestGetChangelist_GetsCorrectString {

    private AppVersion appVersion;
    private String expectedName;

    @BeforeEach
    public void setup() {
        expectedName = "my-ami-name";
        appVersion = AppVersion.parseName(expectedName);
    }

    @Test
    public void testGetChangelist_GetsCorrectString() {
        String actual = appVersion.getChangelist();
        verify(appVersion).getCommit();
        assertNotEquals("invalid-ami-name", actual);
    }

}