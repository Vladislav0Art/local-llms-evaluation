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
public class GeneratedGetVersion ReturnsExpectedValue {

    @Mock
    private Pattern pattern;

    public AppVersion() {
    }

    @Test
    public void getVersion

    ReturnsExpectedValue() {
        AppVersion appVersion = new AppVersion();
        appVersion.setVersion("test");

        assertThat(appVersion.getVersion(), is("test"));
    }

}