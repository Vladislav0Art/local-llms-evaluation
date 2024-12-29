package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dsl.DefaultEvalContext;
import org.eclipse.collections.api.list.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetExternalEvalContextTest {

    @Test
    public void SetExternalEvalContextTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DefaultEvalContext mockEvalContext = new DefaultEvalContext();
        dataFrame.setExternalEvalContext(mockEvalContext);
        assertNotNull(dataFrame.getEvalContext());
    }

}