package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMap {

    @Test
    public void testMap() {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        for (Object value : map.values()) {
            assertEquals(0, (int) value); // Replace with actual values
        }
    }

}