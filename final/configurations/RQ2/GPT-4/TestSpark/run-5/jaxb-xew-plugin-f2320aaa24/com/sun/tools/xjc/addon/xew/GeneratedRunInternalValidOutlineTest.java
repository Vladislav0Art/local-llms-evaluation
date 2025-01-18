package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalValidOutlineTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalValidOutlineTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

}