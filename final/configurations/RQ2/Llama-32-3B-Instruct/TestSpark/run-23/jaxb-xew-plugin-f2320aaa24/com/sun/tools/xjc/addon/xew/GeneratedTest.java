package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternal_Works() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_ThrowsClassNotFoundException() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            Outline outline = new Outline();
            plugin.runInternal(outline);
            fail("Expected ClassNotFoundException to be thrown");
        } catch (ClassNotFoundException e) {
            assertEquals("Class not found", e.getMessage());
        }
    }

    @Test
    public void runInternal_ThrowsIOException() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            Outline outline = new Outline();
            plugin.runInternal(outline);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            // expected exception
        }
    }
}

@Test
public void addAnnotation_Works() throws Exception {
    String annotation = "annotation";
    assertEquals("annotation", XmlElementWrapperPluginUtils.addAnnotation(annotation));
}

@Test
public void copyAnnotationMemberValue_Works() {
    String annotation = "annotation";
    Object value = "value";
    assertEquals(value, XmlElementWrapperPluginUtils.copyAnnotationMemberValue(annotation, value));
}

@Test
public void copyFields_Works() {
    XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
    Map<String, Object> map = new HashMap<>();
    map.put("key", "value");
    Object copiedMap = XmlElementWrapperPluginUtils.copyFields(map);
    assertNotNull(copiedMap);
    assertEquals(1, copiedMap.size());
}

@Test
public void generableToString_Works() {
    String annotation = "annotation";
    assertEquals("annotation", XmlElementWrapperPluginUtils.generableToString(annotation));
}

@Test
public void getAnnotation_Works() throws Exception {
    String annotation = "annotation";
    assertEquals(annotation, XmlElementWrapperPluginUtils.getAnnotation(annotation));
}

@Test
public void getAnnotationMember_Works() throws Exception {
    String annotation = "annotation";
    Object member = "member";
    assertEquals(member, XmlElementWrapperPluginUtils.getAnnotationMember(annotation, member));
}

@Test
public void getAnnotationMemberValue_Works() throws Exception {
    String annotation = "annotation";
    Object value = "value";
    assertEquals(value, XmlElementWrapperPluginUtils.getAnnotationMemberValue(annotation, value));
}

@Test
public void getPrivateField_Works() throws Exception {
    String field = "field";
    Object value = "value";
    assertEquals(value, XmlElementWrapperPluginUtils.getPrivateField(field, value));
}

@Test
public void getXsdDeclaration_Works() throws Exception {
    xsdDeclaration();
    assertTrue(XMLElementWrapperPluginUtils.getXsdDeclaration().isPresent());
}

@Test
public void hasPropertyNameCustomization_Works() {
    XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
    assertTrue(plugin.hasPropertyNameCustomization("propertyName"));
}

@Test
public void isListedAsParametrisation_Works() {
    XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
    assertFalse(plugin.isListedAsParametrisation());
}

@Test
public void setPrivateField_Works() throws Exception {
    String field = "field";
    Object value = "value";
    XmlElementWrapperPluginUtils.setPrivateField(field, value);
    assertEquals(value, XmlElementWrapperPluginUtils.getPrivateField(field));
}
	}

@Test
public void newClassConfiguration_Works() {
    XmlElementWrapperPluginConfig config = new XmlElementWrapperPluginConfig();
    assertNotNull(config);
}

@Test
public void newCommonConfiguration_Works() {
    XmlElementWrapperPluginConfig config = new XmlElementWrapperPluginConfig();
    assertTrue(config instanceof CommonConfiguration);
}
	}

@Test
public void setDefaultValues_Works() throws Exception {
    XmlElementWrapperPluginOptions options = new XmlElementWrapperPluginOptions();
    options.setDefaultValues();
    assertEquals("defaultValue", options.getDefaultValue());
}

}