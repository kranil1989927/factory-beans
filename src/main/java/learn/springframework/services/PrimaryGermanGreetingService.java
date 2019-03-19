package learn.springframework.services;

public class PrimaryGermanGreetingService implements GreetingService {
	private GreetingRepository greetingRepository;

	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return this.greetingRepository.getGermanGreeting();
	}

}
