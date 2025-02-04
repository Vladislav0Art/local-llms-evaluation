package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[parseName_MultipleGroups_ReturnsAllValues]{

@Test
public void [parseName_MultipleGroups_ReturnsAllValues](){
String amiName = "subscriberha-1.0.0-586499.h150";
AppVersion result = AppVersion.parseName(amiName);

assertEquals("subscriberha",result.packageName);

assertEquals("1.0.0-586499",result.version);
	}

            }