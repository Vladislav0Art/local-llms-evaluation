package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedAddSinglePropertyTest {

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
    public void addSinglePropertyTest() {
        new PropertyListBuilder().add(propertyMock);
        assertEquals(1, new PropertyListBuilder().create().size());
    }

}