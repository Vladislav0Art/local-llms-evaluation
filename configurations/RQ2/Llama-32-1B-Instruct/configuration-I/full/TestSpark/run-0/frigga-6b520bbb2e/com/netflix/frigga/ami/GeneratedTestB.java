package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestB {

    @Test
    public void testB() {
        Map<String, Object> data = new HashMap<>();
        data.put("a", 1);
        data.put("b", 2);
        AmiVersion other = new AmiVersion(ami.getRpmPackage(), "20.04");
        Assert.assertEquals(other.hashCode(), data.hashCode());
    }

}