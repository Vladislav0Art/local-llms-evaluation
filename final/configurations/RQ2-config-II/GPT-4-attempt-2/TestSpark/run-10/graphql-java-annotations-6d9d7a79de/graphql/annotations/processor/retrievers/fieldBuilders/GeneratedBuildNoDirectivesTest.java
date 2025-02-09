package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;

import java.lang.reflect.Method;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildNoDirectivesTest {

    @Mock
    private Method method;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildNoDirectivesTest() {
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        builder.build();
    }

}