package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Test;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedGetPreferredMediaType_[Scenario]{

@Mock
private ValidationContext context;

@Test
public void getPreferredMediaType_[
Scenario](){
// arrange
String type = "video";

when(context.getPreferredMediaType()).

thenReturn(type);

// act
String result = OPFChecker30.getPreferredMediaType(type, "path");

// assert
assertEquals("video",result);
	}

            }