package rootclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class rootconfigclass {
	
@Bean
public String myName()
{
	return "Hai vasu";
}
	

}
