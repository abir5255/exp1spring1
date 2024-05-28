package sesame.com.dockertp;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockertpApplication {
EtudiantRepository etdRepository;
	public ApiEtudiantApplication(EtudiantRepository etdRepository) {
	super();
	this.etdRepository = etdRepository;
}
	public static void main(String[] args) {
		SpringApplication.run(DockertpApplication.class, args);
	}
@Bean
	CommandLineRunner start() {
		return args -> {
			
			etdRepository.save(new Etudiant(1L,"Ali","Ali", new Date()));
			etdRepository.save(new Etudiant(2L,"Asma","Asma", new Date()));
			etdRepository.save(new Etudiant(3L,"Ahmed","Ahmed", new Date()));

			//customerRepository.findAll().forEach(System.out::println);
		};
	}
}

