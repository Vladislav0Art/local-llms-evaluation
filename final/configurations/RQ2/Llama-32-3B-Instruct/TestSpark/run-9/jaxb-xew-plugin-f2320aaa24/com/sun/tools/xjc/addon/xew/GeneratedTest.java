package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AbstractConfigurablePlugin configurablePlugin;

    @Spy
    private Options options;

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Test
    public void addAnnotation_test() {
        when(configurablePlugin.addAnnotation(Mockito.anyString(), Mockito.anyObject())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.addAnnotation("test", true));
    }

    @Test
    public void copyAnnotationMemberValue_test() {
        when(configurablePlugin.copyAnnotationMemberValue(Mockito.anyString(), Mockito.anyObject())).thenReturn("test");
        assertEquals("test", xmlElementWrapperPlugin.copyAnnotationMemberValue("test", true));
    }

    @Test
    public void copyFields_test() {
        when(configurablePlugin.copyFields(Mockito.anyString(), Mockito.anyMap())).thenReturn(new HashMap<>());
        assertTrue(xmlElementWrapperPlugin.copyFields("test", new HashMap<>()));
    }

    @Test
    public void generateToString_test() {
        when(configurablePlugin.generableToString(Mockito.anyObject())).thenReturn("test");
        assertEquals("test", xmlElementWrapperPlugin.generableToString(true));
    }

    @Test
    public void getAnnotation_test() {
        when(configurablePlugin.getAnnotation(Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.getAnnotation("test"));
    }

    @Test
    public void getAnnotationMember_test() {
        when(configurablePlugin.getAnnotationMember(Mockito.anyString(), Mockito.anyString())).thenReturn("test");
        assertEquals("test", xmlElementWrapperPlugin.getAnnotationMember("test", "test"));
    }

    @Test
    public void getAnnotationMemberValue_test() {
        when(configurablePlugin.getAnnotationMemberValue(Mockito.anyString(), Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.getAnnotationMemberValue("test", true));
    }

    @Test
    public void getPrivateField_test() {
        when(configurablePlugin.getPrivateField(Mockito.anyString())).thenReturn("test");
        assertEquals("test", xmlElementWrapperPlugin.getPrivateField(true));
    }

    @Test
    public void getXsdDeclaration_test() {
        when(configurablePlugin.getXsdDeclaration(Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.getXsdDeclaration("test"));
    }

    @Test
    public void hasPropertyNameCustomization_test() {
        when(configurablePlugin.hasPropertyNameCustomization(Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.hasPropertyNameCustomization("test"));
    }

    @Test
    public void isHiddenClass_test() {
        when(configurablePlugin.isHiddenClass(Mockito.anyString())).thenReturn(false);
        assertFalse(xmlElementWrapperPlugin.isHiddenClass("test"));
    }

    @Test
    public void isListedAsParametrisation_test() {
        when(configurablePlugin.isListedAsParametrisation(Mockito.anyString())).thenReturn(true);
        assertTrue(xmlElementWrapperPlugin.isListedAsParametrisation("test"));
    }

}