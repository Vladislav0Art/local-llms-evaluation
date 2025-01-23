package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_XSDeclarationPresent_NoException {

    @InjectMocks
    private XmlElementWrapperPlugin plugin;

    @Test
    public void runInternal_XSDeclarationPresent_NoException() throws Exception {
        Outline outline = new Outline();
        XSDeclaration xsDeclaration = new XSDeclaration();
        outline.setXsDeclaration(xsDeclaration);
        plugin.runInternal(outline);
    }

}