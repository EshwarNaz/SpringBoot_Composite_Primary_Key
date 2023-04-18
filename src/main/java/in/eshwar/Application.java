package in.eshwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.eshwar.entity.AccountEntity;
import in.eshwar.entity.AccountPk;
import in.eshwar.repo.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepository bean = context.getBean(AccountRepository.class);

		AccountPk pk = new AccountPk();
		pk.setAccnum(20921907871L);
		pk.setAccType("Savings");
		AccountEntity entity = new AccountEntity();
		entity.setBranch("AP RAYONS");
		entity.setHolder_Name("Tirupathi");
		entity.setAccpk(pk);
		bean.save(entity);

	}

}
