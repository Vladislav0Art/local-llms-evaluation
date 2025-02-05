package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWhenDirectivesExistsTest {

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Mock
    private Method method;

    @Test
    public void buildWhenDirectivesExistsTest() throws NoSuchMethodException {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, processingElementsContainer);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertNotNull(result);
    }

}