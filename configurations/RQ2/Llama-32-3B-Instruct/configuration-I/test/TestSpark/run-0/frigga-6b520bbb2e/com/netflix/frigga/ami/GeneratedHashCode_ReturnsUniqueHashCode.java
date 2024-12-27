package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import java.util.Random;
import java.io.IOException;
import java.util.Collections;

public class GeneratedHashCode_ReturnsUniqueHashCode {

    @Test
    public void hashCode_ReturnsUniqueHashCode() {
        AppVersion appVersion = new AppVersion();
        assertNotEquals(0, appVersion.hashCode());
    }

}