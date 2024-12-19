package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestXmlRemoveAttribute {

    public void addXmlElementWrapper() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

    public void handleAddElement() {
        Outline outline = new Outline();
        Mockito.when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.parseXmlElement(outline)).thenReturn(true);
        verify(plugin).parseXmlElement(outline);
    }

    public void parseXmlElement() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Mockito.when(plugin.parseXmlElement(outline)).thenReturn(true);
        assert plugin.parseXmlElement(outline) == true;
    }

    public void handleRemoveAttribute() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Mockito.when(plugin.parseXmlElement(outline)).thenReturn(true);
        try {
            plugin.runInternal(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

    public void handleRemoveAttributeWithWildcard() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Mockito.when(plugin.parseXmlElement(outline)).thenReturn(true);
        try {
            plugin.runInternal(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

    public void parseXmlElementWhenMultipleElementsArePresent() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Mockito.when(plugin.parseXmlElement(outline)).thenReturn(true);
        try {
            plugin.runInternal(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

    @Test
    public void testXmlRemoveAttribute() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.handleRemoveAttribute(outline)).thenReturn(true);
        try {
            Mockito.verify(plugin).handleRemoveAttribute(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

}