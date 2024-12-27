package org.wso2.lsp4intellij.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import junit.framework.TestCase;
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

import static org.mockito.Mockito.*;

public class GeneratedPathToUriTest {

    @Test
    public void pathToUriTest() {
        assertEquals("file:/home/project", FileUtils.pathToUri("/home/project"));
        assertNull(FileUtils.pathToUri(null));
    }

}