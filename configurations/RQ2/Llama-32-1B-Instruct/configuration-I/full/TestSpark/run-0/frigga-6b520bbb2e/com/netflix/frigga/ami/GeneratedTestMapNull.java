package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMapNull {

    @Test
    public void testMapNull() {
        Map<String, Integer> map = new java.util.HashMap<>();
        Object nullValue = null;

        try {
            map.put("a", nullValue);
        } catch (NullPointerException e) {
            assert true; // This will never be reached
        }
    }

}