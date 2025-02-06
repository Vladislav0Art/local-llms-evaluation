package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetCommitReturnsCommitHash {

    @Mock
    private Pattern getAppVersionPatternMock();

    @Test
    public void getCommitReturnsCommitHash() {
        AppVersion appVersion = new AppVersion("ami-name", "build-number", "commit-hash");
        String commit = appVersion.getCommit();
        assertTrue(commit.equals(NameConstants.COMMIT_HASH));
    }

}