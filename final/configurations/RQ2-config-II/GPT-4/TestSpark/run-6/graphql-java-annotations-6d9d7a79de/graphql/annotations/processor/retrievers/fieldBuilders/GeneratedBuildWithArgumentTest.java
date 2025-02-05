package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildWithArgumentTest {

    @Test
    public void buildWithArgumentTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        Field field = Mockito.mock(Field.class);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[]{
        @GraphQLDirectives({@GraphQLDirective(name = "test", args = {@Arg(name = "arg", value = "value")})})});

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertSame(1, directives.length);
        Assert.assertSame(1, directives[0].getArguments().size());

        GraphQLArgument argument = directives[0].getArgument("arg");

        Assert.assertNotNull(argument);
        Assert.assertEquals("arg", argument.getName());
        Assert.assertEquals("value", argument.getValue());
    }

}