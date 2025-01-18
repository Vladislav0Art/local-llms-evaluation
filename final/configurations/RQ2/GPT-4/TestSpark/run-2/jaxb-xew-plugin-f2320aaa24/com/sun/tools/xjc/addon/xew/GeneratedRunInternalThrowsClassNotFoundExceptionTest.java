package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalThrowsClassNotFoundExceptionTest {

    private XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

    @Mock
    private Outline mockOutline;

    @Test
    public void runInternalThrowsClassNotFoundExceptionTest() {
        try {
            doThrow(ClassNotFoundException.class).when(mockOutline).getCodeModel();
            xmlElementWrapperPlugin.runInternal(mockOutline);
            fail("Expected exception was not thrown");
        } catch (ClassNotFoundException | IOException e) {
            // This exception is expected.
        }
    }

}