package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedParseName_WithoutPackageOrVersion_RaisesException {

    @Test
    public void parseName_WithoutPackageOrVersion_RaisesException() {
        String amiName = "invalid";
        try {
            AppVersion.parseName(amiName);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}