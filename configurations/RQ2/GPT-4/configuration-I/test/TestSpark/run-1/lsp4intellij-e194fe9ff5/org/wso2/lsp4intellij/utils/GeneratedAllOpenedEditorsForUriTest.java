package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.Assert;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.newvfs.ArchiveFileSystem;
import com.intellij.psi.PsiFile;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;
import org.wso2.lsp4intellij.extensions.EditorEventManager;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;
import java.util.Set;

import static org.mockito.Mockito.*;

import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

import java.util.HashSet;
import java.util.List;

public class GeneratedAllOpenedEditorsForUriTest {

    @Override
    protected @NotNull LightProjectDescriptor getProjectDescriptor() {
        return JAVA_8;
    }

    @Test
    public void allOpenedEditorsForUriTest() {
        Project project = getProject();
        String uri = Paths.get(getTestDataPath(), "HelloWorld.java").toUri().toString();

        Assert.assertNotNull(FileUtils.getAllOpenedEditorsForUri(project, uri));
    }

}