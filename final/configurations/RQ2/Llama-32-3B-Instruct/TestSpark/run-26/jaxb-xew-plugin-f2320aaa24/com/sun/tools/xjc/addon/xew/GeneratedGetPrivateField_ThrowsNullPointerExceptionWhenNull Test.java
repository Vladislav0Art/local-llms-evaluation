package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetPrivateField_ThrowsNullPointerExceptionWhenNull Test {

    @Test
    public void getPrivateField_ThrowsNullPointerExceptionWhenNull

    Test() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            JClass jClass = (JClass) ObjectUtils.defaultIfNull(plugin.getAnnotation(), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}