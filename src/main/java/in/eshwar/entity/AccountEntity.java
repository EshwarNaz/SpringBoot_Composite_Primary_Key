package in.eshwar.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class AccountEntity {

	private String Holder_Name;
	private String Branch;
	@EmbeddedId
	private AccountPk accpk;
}
