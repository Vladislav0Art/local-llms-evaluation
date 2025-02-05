package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.model.Model;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outlineMock = mock(Outline.class);
        Options optionsMock = mock(Options.class);
        when(outlineMock.getCodeModel()).thenReturn(new JCodeModel());
        when(outlineMock.getModel()).thenReturn(new Model(optionsMock, null, null));

        try {
            xmlElementWrapperPlugin.runInternal(outlineMock);
        } catch (Exception e) {
            Assert.fail("Should not have thrown any exception");
        }
    }

}