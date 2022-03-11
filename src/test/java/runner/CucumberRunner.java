package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
		glue = { "" }, 
		plugin = { "pretty",
		"html:target/relatoriosimples",
		"json:target/relatoriosimples.json", },
		publish = true, 
		monochrome = true, 
		snippets = SnippetType.CAMELCASE, 
		tags = "@Logout"
		)


public class CucumberRunner {

}
