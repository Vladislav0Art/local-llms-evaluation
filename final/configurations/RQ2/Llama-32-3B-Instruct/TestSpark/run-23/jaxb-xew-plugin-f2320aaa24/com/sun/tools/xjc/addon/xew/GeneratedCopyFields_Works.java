package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCopyFields_Works {

    @Test
    public void copyFields_Works() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Map<String, Object> map = new HashMap<>();
        map.put("key", "value");
        Object copiedMap = XmlElementWrapperPluginUtils.copyFields(map);
        assertNotNull(copiedMap);
        assertEquals(1, copiedMap.size());
    }

}