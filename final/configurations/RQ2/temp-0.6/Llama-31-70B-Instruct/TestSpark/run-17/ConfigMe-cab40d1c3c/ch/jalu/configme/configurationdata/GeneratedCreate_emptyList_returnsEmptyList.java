package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedCreate_emptyList_returnsEmptyList {

    @Test
    public void create_emptyList_returnsEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> propertyList = builder.create();
        assertEquals(0, propertyList.size());
    }

}