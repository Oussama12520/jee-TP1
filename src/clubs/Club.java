package clubs;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Club {
	@Getter
	@Setter
	private String nom;
	@Getter
	private Set<Etudiant> members; //= new HashSet<Etudiant>();
	
	public Optional<Etudiant> chercherMembre(String email){
		if(email==null)
			//return null;
			return Optional.empty();
		
		return members.stream().filter(e->email.equals(e.getEmail())).findFirst();
	}
	public boolean addMembre(Etudiant d) {
		if(d.equals(null) || d.getEmail().equals(null))
			return false;
		
		members.add(d);
		return true;
		
	}
	public void setEmailMember(String email1, String email2) {
		if(chercherMembre(email1).equals(null))
			return;
		
		Optional<Etudiant> e =  chercherMembre(email1);
		if(e.isPresent()) {
			Etudiant e1 = e.get();
			members.remove(e1);
			e1.setEmail(email2);
			addMembre(e1);
		}
	}
	
}
