package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GeneratedRunInternal_NoOutliner_ThrowsIOException {

    @Test
    public void runInternal_NoOutliner_ThrowsIOException() throws ClassNotFoundException, IOException {
        // set up mock outline
        Outline outlineMock = new Outline() {
            @Override
            public void visitElement(OutlineVisitor visitor) {
            }

            @Override
            public void visitAttribute(OutlineVisitor visitor) {
            }
        };
        // run internal method on mock outline
        try {
            XmlElementWrapperPlugin.runInternal(outlineMock);
            fail("Expected IOException");
        } catch (IOException e) {
            // pass
        }
    }

}