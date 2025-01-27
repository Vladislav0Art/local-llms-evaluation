package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetComment_EmptyLinesAndSupplier {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void setComment_EmptyLinesAndSupplier() {
        Map<String, List<String>> comments = new HashMap<>();
        when(commentsMap).thenReturn(comments);
        CommentsConfiguration instance = new CommentsConfiguration(commentsMap);
        Supplier<List<String>> supplier = () -> Arrays.asList("line1");
        assertFalse(instance.setComment("path1", "", supplier.get()));
    }

}