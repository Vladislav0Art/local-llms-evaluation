package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetChangelist_Dehprecated_ReturnsEmptyString {

    @Test
    public void getChangelist_Dehprecated_ReturnsEmptyString() {
        @Deprecated String changelist = AppVersion.parseName("").getChangelist();
        assertEquals(changelist, "");
    }

}