package com.netflix.frigga.ami;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCompareTo_shouldReturnNegative1WhenOneObjectIsNull {

    @Test
    public void compareTo_shouldReturnNegative1WhenOneObjectIsNull() {
        // arrange
        AppVersion appVersion1 = new AppVersion();
        AppVersion appVersion2 = null;

        // act
        int result = appVersion1.compareTo(appVersion2);

        // assert
        assertEquals(-1, result);
    }

}