package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal SetsXsdDeclarationOnClass {

    @Test
    public void runInternal

    SetsXsdDeclarationOnClass() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = createOutline();
        plugin.runInternal(outline);
        assertTrue(hasXsdDeclaration(outline));
    }

}