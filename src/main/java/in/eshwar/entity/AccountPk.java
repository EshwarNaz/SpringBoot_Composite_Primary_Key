package in.eshwar.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable {

	private Long Accnum;
	private String AccType;
}
