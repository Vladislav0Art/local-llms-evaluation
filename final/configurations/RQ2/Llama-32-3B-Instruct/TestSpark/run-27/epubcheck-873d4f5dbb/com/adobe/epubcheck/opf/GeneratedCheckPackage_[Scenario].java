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
public class GeneratedCheckPackage_[Scenario]{

@Mock
private ValidationContext context;

@Test
public void checkPackage_[
Scenario](){
// arrange
Set<Reference> references = Set.of();

when(context.getReferences()).

thenReturn(references);

// act
boolean result = new OPFChecker30(context).checkPackage();

// assert
assertTrue(result);
	}

            }