package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.OutputStreamWriter;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_Succeeds {

    @Mock
    private Outline outline;

    @Mock
    private OutputStreamWriter outputStreamWriter;

    @Spy
    private AbstractConfigurablePlugin configurablePlugin;

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Test
    public void runInternal_Succeeds() throws IOException, ClassNotFoundException {
        // Given
        configure();

        // When
        xmlElementWrapperPlugin.runInternal(outline);

        // Then
        verify(outputStreamWriter).write();
    }

}