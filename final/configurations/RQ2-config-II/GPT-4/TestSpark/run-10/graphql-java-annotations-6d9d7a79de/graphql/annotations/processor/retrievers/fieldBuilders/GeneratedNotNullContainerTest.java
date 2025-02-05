package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;

import graphql.annotations.processor.ProcessingElementsContainer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNotNullContainerTest {

    @Mock
    private Field field;

    @Test
    public void notNullContainerTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(field, container);

        assertNotNull(builder);
    }

}