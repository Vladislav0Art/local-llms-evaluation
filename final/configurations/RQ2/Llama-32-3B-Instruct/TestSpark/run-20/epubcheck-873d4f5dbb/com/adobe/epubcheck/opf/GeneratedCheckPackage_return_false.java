package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Set;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackage_return_false {

    @RunWith(MockitoJUnitRunner.class)
    public class OPFChecker30_test {

        @Test
        public void checkPackage_return_false() {
            boolean result = new OPFChecker30(new ValidationContext()).checkPackage();
            assertTrue(result);
        }

    }