package org.wso2.lsp4intellij.utils;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.testFramework.LightVirtualFile;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.wso2.lsp4intellij.editor.EditorEventManager;
import org.wso2.lsp4intellij.editor.EditorEventManagerBase;
import org.wso2.lsp4intellij.utils.FileUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedProjectToUriTest {

    @Test
    public void projectToUriTest() {
        // Assuming getter for the base path of the project returns "/home/projectDir"
        Project mockProject = Mockito.mock(Project.class);
        when(mockProject.getBasePath()).thenReturn("/home/projectDir");

        String result = FileUtils.projectToUri(mockProject);
        assertEquals("file:/home/projectDir", result);
    }

}