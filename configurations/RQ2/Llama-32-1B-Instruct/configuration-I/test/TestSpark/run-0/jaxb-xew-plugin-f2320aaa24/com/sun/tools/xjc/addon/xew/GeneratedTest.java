package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.config.ConfigurablePlugin;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testRunInternal() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);

        // Assert
        assert !outline.isInvalid();
    }

    @Test
    public void testRunInternal_InvalidInput() {
        // Arrange
        Outline outline = new Outline();
        try {
            XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (ClassNotFoundException e) {
        }
    }

    @Test
    public void testRunInternal_IOException() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void testRunInternal_NoXmlFile() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_NoConfiguration() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_ConfigurationMissing() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_ConfigurationMissing_InvalidPlugins() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_ConfigurationMissing_PackageNotExists() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_ConfigurationMissing_PackageNotExists_InvalidPlugins() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

    @Test
    public void testRunInternal_ConfigurationMissing_InvalidPlugins_PackageNotExists() {
        // Arrange
        Outline outline = new Outline();

        // Act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outline);
            fail("Expected an InvalidXmlFileException");
        } catch (InvalidXmlFileException e) {
        }
    }

}