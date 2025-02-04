package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[getVersion_ReturnValue]{

@Test
public void [getVersion_ReturnValue](){
AppVersion appVersion = new AppVersion("subscriberha", "1.0.0-586499");

assertEquals("1.0.0-586499",appVersion.getVersion());
        }

        }