package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalNormalScenarioTest {

    @Test
    public void runInternalNormalScenarioTest() throws Exception {
        XmlElementWrapperPlugin testXmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline testOutline = Mockito.mock(Outline.class);
        Mockito.when(testOutline.getCodeModel()).thenReturn(null);
        testXmlElementWrapperPlugin.runInternal(testOutline);
    }

}