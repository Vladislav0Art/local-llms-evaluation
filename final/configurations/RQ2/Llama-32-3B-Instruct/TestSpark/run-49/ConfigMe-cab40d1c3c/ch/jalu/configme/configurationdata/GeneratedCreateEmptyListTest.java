package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedCreateEmptyListTest {

    @Mock
    private Property<?> propertyMock;

    public void setPropertyMock(Property<?> propertyMock) {
        this.propertyMock = propertyMock;
    }

    @org.junit.Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createEmptyListTest() {
        assertTrue(new PropertyListBuilder().create().isEmpty());
    }

}