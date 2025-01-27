package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCopyFields_copyingWrappedElementsProperties {

    @Test
    public void copyFields_copyingWrappedElementsProperties() throws IOException, ClassNotFoundException {
        // Arrange
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        Map<String, Object> sourceProperties = new HashMap<>();
        sourceProperties.put("wrappedElementValue", "test value");

        JClass wrappedClass = outline.getGeneratedClasses().get(0);

        // Act
        CommonUtils.copyFields(wrappedClass, outline, sourceProperties);

        // Assert
        CPropertyInfo propertyInfo = getPrivateField(outline, "wrappedElementValue").getAnnotation(CPropertyInfo.class);
        assertEquals(sourceProperties.get("wrappedElementValue"), propertyInfo.getValue());
    }

}