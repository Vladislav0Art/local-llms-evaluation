package org.semver4j;

import org.junit.Test;
import org.semver4j.RangesList;
import org.semver4j.Range;
import org.semver4j.Semver;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedIsSatisfiedByTest {

    @Test
    public void isSatisfiedByTest() {
        RangesList rangesList = new RangesList();
        List<Range> ranges = new ArrayList<>();
        rangesList.add(ranges);
        Semver version = mock(Semver.class);
        assertTrue(rangesList.isSatisfiedBy(version));
    }

}