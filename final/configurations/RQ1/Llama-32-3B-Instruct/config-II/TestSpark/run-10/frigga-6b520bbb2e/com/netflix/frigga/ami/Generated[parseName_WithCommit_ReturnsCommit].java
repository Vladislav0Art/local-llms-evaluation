package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[parseName_WithCommit_ReturnsCommit]{

@Test
public void [parseName_WithCommit_ReturnsCommit](){
String amiName = "subscriberha-1.0.0-586499.h150/WE-WAPP-subscriberha/150";
AppVersion result = AppVersion.parseName(amiName);

assertNotNull(result.commit);
	}

            }