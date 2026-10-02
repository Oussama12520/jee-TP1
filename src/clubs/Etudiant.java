package clubs;

import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Period;

@EqualsAndHashCode(of="email")
@ToString

@RequiredArgsConstructor
public class Etudiant {
	@Getter
	@Setter
	@NonNull
	private String nom;
	@Getter
	@Setter
	@NonNull
	private LocalDate dateNais;
	@Getter
	@Setter
	@NonNull
	private String email;
	
	private int age = 0;
	
	
	
	public int getAge() {
		return Period.between(LocalDate.now(),dateNais).getYears();
	}

	

	
	
	
	
	
}
