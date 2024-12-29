package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.wso2.lsp4intellij.utils.FileUtils;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllOpenedEditorsForVirtualFileTest {

    @Test
    public void getAllOpenedEditorsForVirtualFileTest() {
        Project mockProject = mock(Project.class);
        VirtualFile mockFile = mock(VirtualFile.class);
        List<Editor> result = FileUtils.getAllOpenedEditorsForVirtualFile(mockProject, mockFile);
        assertNotNull(result);
    }

}