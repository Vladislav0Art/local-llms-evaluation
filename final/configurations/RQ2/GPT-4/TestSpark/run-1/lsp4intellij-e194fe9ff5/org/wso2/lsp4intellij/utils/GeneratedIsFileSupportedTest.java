package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFileSupportedTest {

    @Test
    public void isFileSupportedTest() {
        VirtualFile mockFile = mock(VirtualFile.class);
        boolean result = FileUtils.isFileSupported(mockFile);
        assertTrue(result);
    }

}