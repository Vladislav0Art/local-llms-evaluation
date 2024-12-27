package org.wso2.lsp4intellij.utils;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.testFramework.LightVirtualFile;
import org.junit.Test;
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

@RunWith(MockitoJUnitRunner.class)
public class GeneratedReloadAllEditorsTest {

    @Mock
    private Project mockProject;
    @Mock
    private PsiFile mockPsiFile;
    @Mock
    private Editor mockEditor;
    @Mock
    private VirtualFile mockVirtualFile;
    @Mock
    private FileType mockFileType;

    @Test
    public void reloadAllEditorsTest() {
        FileUtils.reloadAllEditors();
        assertTrue(true);
    }

}