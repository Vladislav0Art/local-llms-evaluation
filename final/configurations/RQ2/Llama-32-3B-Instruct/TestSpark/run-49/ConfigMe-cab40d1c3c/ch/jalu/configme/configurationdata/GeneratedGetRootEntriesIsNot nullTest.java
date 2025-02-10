package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedGetRootEntriesIsNot nullTest {

    @Mock
    private Property<?> propertyMock;

    public void setPropertyMock(Property<?> propertyMock) {
        this.propertyMock = propertyMock;
    }

    @Test
    public void getRootEntriesIsNot

    nullTest() {
        Map<String, Object> map = new PropertyListBuilder().getRootEntries();
        assertNull(map);
    }
}

}