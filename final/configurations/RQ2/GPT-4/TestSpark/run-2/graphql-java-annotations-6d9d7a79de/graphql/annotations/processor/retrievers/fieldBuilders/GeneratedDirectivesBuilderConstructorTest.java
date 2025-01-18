package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDirectivesBuilderConstructorTest {

    @Test
    public void DirectivesBuilderConstructorTest() {
        try {
            ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
            Method method = mock(Method.class);
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);
            assertNotNull(directivesBuilder);
        } catch (Exception e) {
            fail("Construction failed with exception: " + e.getMessage());
        }
    }

}