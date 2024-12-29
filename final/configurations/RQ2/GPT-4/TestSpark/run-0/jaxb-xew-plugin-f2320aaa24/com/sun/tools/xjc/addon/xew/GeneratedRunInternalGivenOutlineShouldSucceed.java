package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalGivenOutlineShouldSucceed {

    @Mock
    private Outline outline;

    @Test
    public void runInternalGivenOutlineShouldSucceed() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        doNothing().when(outline).generateSchemaFiles();

        xmlElementWrapperPlugin.runInternal(outline);

        verify(outline).generateSchemaFiles();
    }

}