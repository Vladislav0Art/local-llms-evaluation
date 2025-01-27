package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateList_PropertyListIsNotEmpty {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void createList_PropertyListIsNotEmpty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> list = builder.create();
        assertNotNull(list);
        assertNotNull(((ArrayList<Property<?>>) list).get(0));
    }

}