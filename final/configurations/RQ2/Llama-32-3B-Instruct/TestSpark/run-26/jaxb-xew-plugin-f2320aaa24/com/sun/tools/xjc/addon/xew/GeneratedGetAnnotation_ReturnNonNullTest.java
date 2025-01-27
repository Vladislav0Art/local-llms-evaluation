package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetAnnotation_ReturnNonNullTest {

    @Test
    public void getAnnotation_ReturnNonNullTest() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JClass jClass = (JClass) ObjectUtils.defaultIfNull(plugin.getAnnotation(), null);
        assertEquals(JClass.class, jClass.getClass());
    }

}