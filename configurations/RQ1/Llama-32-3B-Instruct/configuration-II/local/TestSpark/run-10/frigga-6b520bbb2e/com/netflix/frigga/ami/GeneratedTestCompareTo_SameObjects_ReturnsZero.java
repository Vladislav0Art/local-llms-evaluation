package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCompareTo_SameObjects_ReturnsZero {

    @Mock
    private String amiName;

    @InjectMocks
    private AppVersion appVersion;

    @Test
    public void testCompareTo_SameObjects_ReturnsZero() {
        appVersion.setBuildJobName("hudson-1.0.0-586499");
        appVersion.setCommit("hudson-1.0.0-586499");
        AppVersion other = new AppVersion();
        other.setBuildJobName("hudson-1.0.0-586500");
        other.setCommit("hudson-1.0.0-586500");
        assertEquals(0, appVersion.compareTo(other));
    }

}