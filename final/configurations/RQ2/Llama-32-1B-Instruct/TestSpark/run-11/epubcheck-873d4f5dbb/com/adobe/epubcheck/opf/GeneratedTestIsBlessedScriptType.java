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
public class GeneratedTestIsBlessedScriptType {

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    public void initHandler() {
        // Test case: initialize handler method with mock object
        when(opfHandler.getHandler()).thenReturn(opfHandler);
    }

    @Test
    public void testIsBlessedScriptType() {
        // Arrange and Act
        String type = "blessed script";
        boolean check = OPFChecker30.isBlessedScriptType(type);

        // Assert
        assertTrue(check);
    }

}