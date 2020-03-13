package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// good pattern for working with external JARS - objects you don't controll
// allows you to use external dependencies in your project

@Configuration
public class ChuckConfiguration {

    @Bean // return instance of ChuckNorrisQuotes bean --> injected in to the JokeServiceImpl
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
