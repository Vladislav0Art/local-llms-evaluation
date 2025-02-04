package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[parseName_ValidPattern_ReturnsInstance]{

@Test
public void [parseName_ValidPattern_ReturnsInstance](){
String amiName = "subscriberha-1.0.0-586499";
AppVersion result = AppVersion.parseName(amiName);

assertNotNull(result);
	}

            }