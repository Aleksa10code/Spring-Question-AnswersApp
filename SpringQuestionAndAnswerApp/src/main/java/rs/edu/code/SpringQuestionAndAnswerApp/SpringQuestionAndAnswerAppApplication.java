package rs.edu.code.SpringQuestionAndAnswerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rs.edu.code.SpringQuestionAndAnswerApp.dao.QuestionRepository;
import rs.edu.code.SpringQuestionAndAnswerApp.service.QuestionService;

@SpringBootApplication
public class SpringQuestionAndAnswerAppApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuestionAndAnswerAppApplication.class, args);
	}

	@Autowired
	private QuestionService service;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Start Spring application!");
		System.out.println("Add answer");












	}


}
