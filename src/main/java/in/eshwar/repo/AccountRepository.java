package in.eshwar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.eshwar.entity.AccountEntity;
import in.eshwar.entity.AccountPk;

public interface AccountRepository extends JpaRepository<AccountEntity, AccountPk> {

}
