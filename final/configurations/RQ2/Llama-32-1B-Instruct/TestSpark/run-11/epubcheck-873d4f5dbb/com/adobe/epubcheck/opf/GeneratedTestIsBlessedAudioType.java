package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlessedAudioType {

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    public void initHandler() {
        // Test case: initialize handler method with mock object
        when(opfHandler.getHandler()).thenReturn(opfHandler);
    }

    @Test
    public void testIsBlessedAudioType() {
        // Arrange and Act
        String type = "blessed audio";
        boolean check = OPFChecker30.isBlessedAudioType(type);

        // Assert
        assertTrue(check);
    }

}