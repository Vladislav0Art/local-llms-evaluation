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
public class GeneratedIsBlessedAudioType_[Scenario]{

@Mock
private ValidationContext context;

@Test
public void isBlessedAudioType_[
Scenario](){

// arrange
when(context.getMediaTypes()).

thenReturn(Set.of("blessed_audio"));

// act
boolean result = OPFChecker30.isBlessedAudioType("blessed_audio");

// assert
assertTrue(result);
	}

            }