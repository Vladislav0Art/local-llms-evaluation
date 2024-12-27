package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedFindProjectsForTest {

    @Test
    public void findProjectsForTest() {
        VirtualFile mockFile = mock(VirtualFile.class);
        Set<Project> projects = FileUtils.findProjectsFor(mockFile);
        Assert.assertNotNull(projects);
    }

}