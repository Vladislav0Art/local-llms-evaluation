package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(null);
    }

}