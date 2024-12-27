package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedEquals_NullAppVersion_ReturnsFalse {

    @Test
    public void equals_NullAppVersion_ReturnsFalse() {
        AppVersion appVersion1 = new AppVersion("my-app-1.2.3");
        AppVersion appVersion2 = null;
        assertFalse(appVersion1.equals(appVersion2));
    }
}

public class TestPattern extends Pattern {

    @Override
    public int literalValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "MockPattern";
    }

}