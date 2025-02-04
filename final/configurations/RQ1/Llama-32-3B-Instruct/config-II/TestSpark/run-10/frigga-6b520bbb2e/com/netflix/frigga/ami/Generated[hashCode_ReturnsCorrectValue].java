package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[hashCode_ReturnsCorrectValue]{

@Test
public void [hashCode_ReturnsCorrectValue](){
String expected = 0x2c8e8e85;
AppVersion appVersion = new AppVersion("subscriberha", "1.0.0-586499");

assertEquals(expected, appVersion.hashCode());
        }

        }