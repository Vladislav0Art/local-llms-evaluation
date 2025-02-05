package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildGivenDirectivesTest {

    @Test
    public void buildGivenDirectivesTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{
        @GraphQLDirectives({@GraphQLDirective(name = "test", args = {})})});

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertSame(1, directives.length);
        Assert.assertEquals("test", directives[0].getName());
    }

}