package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedProjectToUriTest {

    @Test
    public void projectToUriTest() {
        Project mockProject = mock(Project.class);
        String result = FileUtils.projectToUri(mockProject);
        assertNotNull(result);
    }

}