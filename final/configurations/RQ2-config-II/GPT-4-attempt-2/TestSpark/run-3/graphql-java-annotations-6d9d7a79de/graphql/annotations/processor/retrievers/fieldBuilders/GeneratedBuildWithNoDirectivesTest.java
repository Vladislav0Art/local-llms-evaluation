package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class GeneratedBuildWithNoDirectivesTest {

    @Test
    public void buildWithNoDirectivesTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] result = builder.build();
        Assert.assertEquals(0, result.length);
    }

}