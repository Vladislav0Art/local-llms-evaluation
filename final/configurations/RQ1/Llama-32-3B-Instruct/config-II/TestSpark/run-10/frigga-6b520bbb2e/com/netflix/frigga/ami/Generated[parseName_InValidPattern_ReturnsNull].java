package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[parseName_InValidPattern_ReturnsNull]{

@Test
public void [parseName_InValidPattern_ReturnsNull](){
String amiName = "invalid-pattern";
AppVersion result = AppVersion.parseName(amiName);

assertNull(result);
	}

            }