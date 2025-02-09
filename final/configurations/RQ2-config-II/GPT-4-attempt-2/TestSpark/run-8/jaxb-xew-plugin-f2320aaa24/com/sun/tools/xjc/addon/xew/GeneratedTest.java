package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        xmlElementWrapperPlugin.runInternal(outline);

        // Verify that the method was called successfully
        verify(outline).rootClasses();
    }

}