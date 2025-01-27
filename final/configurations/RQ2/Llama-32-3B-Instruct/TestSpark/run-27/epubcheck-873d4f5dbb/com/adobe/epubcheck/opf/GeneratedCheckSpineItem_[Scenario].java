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
public class GeneratedCheckSpineItem_[Scenario]{

@Mock
private ValidationContext context;

@Test
public void checkSpineItem_[
Scenario](){
// arrange
OPFItem item = new OPFItem();

when(context.getOPFItem()).

thenReturn(item);

// act
boolean result = new OPFChecker30(context).checkSpineItem(item, mock(OPFHandler.class));

// assert
assertTrue(result);
	}

            }