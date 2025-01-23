package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_NoConfig_NoException() throws Exception {
        Outline outline = new Outline();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_ConfigurationPresent_NoException() throws Exception {
        Outline outline = new Outline();
        ClassConfiguration config = new ClassConfiguration();
        plugin.setConfiguration(config);
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_NullOutline_ThrowsNullPointerException() throws Exception {
        try {
            plugin.runInternal(null);
            assertTrue(false);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

    @Test
    public void runInternal_NullConfiguration_NoException() throws Exception {
        Outline outline = new Outline();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_EmptyOutline_NoException() throws Exception {
        Outline outline = new Outline();
        outline.setClasses(new ArrayList<>());
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_ClassOutlinePresent_NoException() throws Exception {
        Outline outline = new Outline();
        ClassOutline classOutline = new ClassOutline();
        outline.setClasses(singletonList(classOutline));
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_FieldOutlinePresent_NoException() throws Exception {
        Outline outline = new Outline();
        FieldOutline fieldOutline = new FieldOutline();
        outline.setFields(singletonList(fieldOutline));
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_RingPresent_NoException() throws Exception {
        Outline outline = new Outline();
        Ring ring = new Ring();
        outline.setRing(ring);
        plugin.runInternal(outline);
    }

    @Test
    public void runInternal_XSDeclarationPresent_NoException() throws Exception {
        Outline outline = new Outline();
        XSDeclaration xsDeclaration = new XSDeclaration();
        outline.setXsDeclaration(xsDeclaration);
        plugin.runInternal(outline);
    }

}