package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMapContainsKey {

    @Test
    public void testMapContainsKey() {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        boolean containsKey = map.containsKey("a");
        assertEquals(true, containsKey); // Replace with actual values
    }

}