package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void runInternalTest() {
        Outline outlineMock = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        try {
            xmlElementWrapperPlugin.runInternal(outlineMock);
        } catch (ClassNotFoundException | IOException e) {
            fail("Exception should not be thrown");
        }
    }

}