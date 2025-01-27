package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetXsdDeclaration_Works {

    @Test
    public void getXsdDeclaration_Works() throws Exception {
        xsdDeclaration();
        assertTrue(XMLElementWrapperPluginUtils.getXsdDeclaration().isPresent());
    }

}