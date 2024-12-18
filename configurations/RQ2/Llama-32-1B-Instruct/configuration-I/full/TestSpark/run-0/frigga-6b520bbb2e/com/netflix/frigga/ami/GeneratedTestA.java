package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestA {

    @Test
    public void testA() {
        Ami ami = new Ami("1", "20.04");
        Map<String, Object> data = new HashMap<>();
        data.put("a", 1);
        data.put("b", 2);
        Map<String, String> map = new HashMap<>();
        map.put("c", "d");
        map.put("e", "f");
        data.put("map", map);
        AmiVersion other = new AmiVersion(ami.getRpmPackage(), "20.04");
        Assert.assertEquals(other.hashCode(), ami.hashCode());
    }

}