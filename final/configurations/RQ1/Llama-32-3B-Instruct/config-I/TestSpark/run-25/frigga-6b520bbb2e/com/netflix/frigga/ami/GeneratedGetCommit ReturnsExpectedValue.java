package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedGetCommit ReturnsExpectedValue {

    @Mock
    private Pattern pattern;

    public AppVersion() {
    }

    @Test
    public void getCommit

    ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setCommit("test");

        assertThat(appVersion.getCommit(), is("test"));
    }

}