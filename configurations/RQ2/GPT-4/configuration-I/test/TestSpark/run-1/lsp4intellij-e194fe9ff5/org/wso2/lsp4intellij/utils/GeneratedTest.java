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

public class GeneratedTest {

    @Override
    protected @NotNull LightProjectDescriptor getProjectDescriptor() {
        return JAVA_8;
    }

    @Test
    public void allOpenedEditorTest() {
        Project project = getProject();
        Assert.assertNotNull(FileUtils.getAllOpenedEditors(project));
    }

    @Test
    public void allOpenedEditorsForUriTest() {
        Project project = getProject();
        String uri = Paths.get(getTestDataPath(), "HelloWorld.java").toUri().toString();

        Assert.assertNotNull(FileUtils.getAllOpenedEditorsForUri(project, uri));
    }

    @Test
    public void allOpenedEditorsForVirtualFileTest() {
        Project project = getProject();
        VirtualFile file = myFixture.configureByFile("HelloWorld.java").getVirtualFile();

        Assert.assertNotNull(FileUtils.getAllOpenedEditorsForVirtualFile(project, file));
    }

    @Test
    public void reloadAllEditorsTest() {
        FileUtils.reloadAllEditors();
    }

    @Test
    public void reloadEditorsTest() {
        Project project = getProject();
        FileUtils.reloadEditors(project);
    }

    @Test
    public void editorFromPsiFileTest() {
        PsiFile psiFile = myFixture.configureByFile("HelloWorld.java");

        Assert.assertNotNull(FileUtils.editorFromPsiFile(psiFile));
    }

    @Test
    public void editorFromUriTest() {
        Project project = getProject();
        String uri = Paths.get(getTestDataPath(), "HelloWorld.java").toUri().toString();

        Assert.assertNotNull(FileUtils.editorFromUri(uri, project));
    }

    @Test
    public void editorFromVirtualFileTest() {
        Project project = getProject();
        VirtualFile file = myFixture.configureByFile("HelloWorld.java").getVirtualFile();

        Assert.assertNotNull(FileUtils.editorFromVirtualFile(file, project));
    }

    @Test
    public void virtualFileFromURITest() {
        String uri = Paths.get(getTestDataPath(), "HelloWorld.java").toUri().toString();
        Assert.assertNotNull(FileUtils.virtualFileFromURI(uri));
    }

    @Test
    public void VFSToURITest() {
        VirtualFile mockFile = mock(VirtualFile.class);
        String uri = FileUtils.VFSToURI(mockFile);
        Assert.assertNotNull(uri);
    }

    @Test
    public void pathToUriTest() {
        String path = Paths.get(getTestDataPath(), "HelloWorld.java").toString();
        String uri = FileUtils.pathToUri(path);
        Assert.assertNotNull(uri);
    }

    @Test
    public void projectToUriTest() {
        Project project = getProject();
        Assert.assertNotNull(FileUtils.projectToUri(project));
    }

    @Test
    public void isFileSupportedTest() {
        VirtualFile file = myFixture.configureByFile("HelloWorld.java").getVirtualFile();
        Assert.assertTrue(FileUtils.isFileSupported(file));
    }

}