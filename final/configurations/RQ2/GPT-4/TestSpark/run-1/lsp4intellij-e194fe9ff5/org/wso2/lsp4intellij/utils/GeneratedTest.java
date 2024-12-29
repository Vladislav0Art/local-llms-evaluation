package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void sanitizeURITest() {
        String result = FileUtils.sanitizeURI("testUri");
        assertNotNull(result);
    }

    @Test
    public void pathToUriTest() {
        String result = FileUtils.pathToUri("testPath");
        assertNotNull(result);
    }

}