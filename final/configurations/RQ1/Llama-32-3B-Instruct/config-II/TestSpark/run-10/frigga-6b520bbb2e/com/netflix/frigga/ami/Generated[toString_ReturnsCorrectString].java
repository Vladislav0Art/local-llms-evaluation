package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[toString_ReturnsCorrectString]{

@Test
public void [toString_ReturnsCorrectString](){
String expected = "AppVersion [packageName=subscriberha, version=1.0.0-586499, buildJobName=null, buildNumber=null, changelist=null]";
AppVersion appVersion = new AppVersion("subscriberha", "1.0.0-586499");

assertEquals(expected, appVersion.toString());
        }

        }