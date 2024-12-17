package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GeneratedGetChangelist_ThrowsDeprecatedException {

    @Test
    public void getChangelist_ThrowsDeprecatedException() {
        try {
            new AppVersion(1, 2, 3).getChangelist();
            fail("Expected DeprecatedException to be thrown");
        } catch (DeprecationWarning e) {
            // expected exception
        }
    }

}