package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void runInternal_RestoreOriginalValues

    Test() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(options);

        // Assert
        assertTrue(options.isRestoreOriginalValues());
    }

    @Test
    public void runInternal_SkipHiddenElements

    Test() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(options);

        // Assert
        assertTrue(options.isSkipHiddenElements());
    }

    @Test
    public void getAnnotation_ReturnNonNullTest() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JClass jClass = (JClass) ObjectUtils.defaultIfNull(plugin.getAnnotation(), null);
        assertEquals(JClass.class, jClass.getClass());
    }

    @Test
    public void getAnnotation_ThrowsNullPointerExceptionWhenNull

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

    @Test
    public void getAnnotationMember_ReturnNonNullTest() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JClass jClass = (JClass) ObjectUtils.defaultIfNull(plugin.getAnnotation(), null);
        assertEquals(JClass.class, jClass.getClass());
    }

    @Test
    public void getAnnotationMember_ThrowsNullPointerExceptionWhenNull

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

    @Test
    public void getPrivateField_ReturnNonNullTest() throws ClassNotFoundException, IOException {
        // Arrange and Act
        Options options = new Options();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        JClass jClass = (JClass) ObjectUtils.defaultIfNull(plugin.getAnnotation(), null);
        assertEquals(JClass.class, jClass.getClass());
    }

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