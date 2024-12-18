package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestC {

    @Test
    public void testC() {
        Map<String, String> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        AmiVersion other = new AmiVersion(ami.getRpmPackage(), "20.04");
        Assert.assertEquals(other.hashCode(), map.hashCode());
    }

}