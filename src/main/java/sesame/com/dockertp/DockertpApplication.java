package sesame.com.dockertp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockertpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockertpApplication.class, args);
	}
@GetMapping("/test")
public String hello()
{
	return "hello world";
	}
}

