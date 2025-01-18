package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWithExceptionTest {

    @Test
    public void buildWithExceptionTest() {
        try {
            ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
            when(container.getDirective(any())).thenThrow(GraphQLAnnotationsException.class);
            Method method = Mockito.mock(Method.class);
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, container);
            directivesBuilder.build();
            fail("Exception was expected, as we* mocked to throw exception");
        } catch (GraphQLAnnotationsException e) {
            assertTrue("Exception successfully throwed", true);
        }
    }

}