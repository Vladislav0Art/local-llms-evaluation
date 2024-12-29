package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedVirtualFileFromURITest {

    @Test
    public void virtualFileFromURITest() {
        VirtualFile result = FileUtils.virtualFileFromURI("testUri");
        assertNotNull(result);
    }

}