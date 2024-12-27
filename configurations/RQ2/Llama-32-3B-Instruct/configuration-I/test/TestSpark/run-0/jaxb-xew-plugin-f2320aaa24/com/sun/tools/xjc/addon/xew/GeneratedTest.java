package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.OutputStreamWriter;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Outline outline;

    @Mock
    private OutputStreamWriter outputStreamWriter;

    @Spy
    private AbstractConfigurablePlugin configurablePlugin;

    @org.junit.Test
    public void runInternal_Succeeds() throws IOException, ClassNotFoundException {
        // Given
        configure();

        // When
        xmlElementWrapperPlugin.runInternal(outline);

        // Then
        org.mockito.Mockito.verify(outputStreamWriter).write();
    }

}