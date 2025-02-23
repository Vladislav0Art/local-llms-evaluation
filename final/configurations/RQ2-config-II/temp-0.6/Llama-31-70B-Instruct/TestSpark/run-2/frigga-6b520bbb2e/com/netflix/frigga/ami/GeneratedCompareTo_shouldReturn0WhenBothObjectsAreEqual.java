package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_shouldReturn0WhenBothObjectsAreEqual {

    @Test
    public void compareTo_shouldReturn0WhenBothObjectsAreEqual() {
        // arrange
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = new AppVersion();

        // act
        int result = appVersion1.compareTo(appVersion2);

        // assert
        assertEquals(0, result);
    }

}