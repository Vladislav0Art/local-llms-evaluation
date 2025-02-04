package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generated[parseName-InvalidFormat_ReturnsNull]{

@Test
public void [parseName-InvalidFormat_ReturnsNull](){
Matcher matcher = Pattern.compile("[^a-zA-Z0-9]").matcher(" invalid ");

assertFalse(matcher.matches());

assertNull(AppVersion.parseName(" invalid "));
        }

        }