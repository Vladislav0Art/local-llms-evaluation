package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildFieldWithDirectivesTest {

    @Test
    public void buildFieldWithDirectivesTest() throws NoSuchFieldException {
        Field field = this.getClass().getDeclaredField("SAMPLE_DIRECTIVE_FIELD");

        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder builder = new DirectivesBuilder(field, mockContainer);
        GraphQLDirective[] result = builder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
    }

}