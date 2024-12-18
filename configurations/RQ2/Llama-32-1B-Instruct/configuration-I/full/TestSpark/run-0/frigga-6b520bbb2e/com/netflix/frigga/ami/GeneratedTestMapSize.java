package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestMapSize {

    @Test
    public void testMapSize() {
        Map<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        assertEquals(map.size(), 2);
    }

}