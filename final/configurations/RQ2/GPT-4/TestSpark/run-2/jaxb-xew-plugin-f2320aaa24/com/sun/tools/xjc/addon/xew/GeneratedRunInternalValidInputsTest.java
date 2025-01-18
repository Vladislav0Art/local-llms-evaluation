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
public class GeneratedRunInternalValidInputsTest {

    private XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

    @Mock
    private Outline mockOutline;

    @Test
    public void runInternalValidInputsTest() {
        try {
            xmlElementWrapperPlugin.runInternal(mockOutline);
        } catch (ClassNotFoundException | IOException e) {
            fail("Unexpected exception was thrown");
        }
    }

}