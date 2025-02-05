package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedRunInternalWithMockArgumentsTest {

    @Test
    public void runInternalWithMockArgumentsTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline mockedOutline = Mockito.mock(Outline.class);
        xmlElementWrapperPlugin.runInternal(mockedOutline);

        //Further assertions can be implemented based on the actual implementation of the method.
    }

}