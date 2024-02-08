import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doodle {
	private PlageHoraire[] plages;
	// a compl�ter
	private Map<String, boolean[]> disponibilitess;

	public Doodle(PlageHoraire... plages) {
		this.plages = plages;
		// a compl�ter
		disponibilitess= new HashMap<>();
	}

	// ajoute les disponibilit�s d'un participant sous forme d'un tableau de booleen.
	// les indices du tableau correspondent aux indices du tableau plages
	// true � l'indice i veut dire que le participant est disponible pour la plage � l'indice i du tableau plages
	// false � l'indice i veut dire que le participant n'est pas disponible pour la plage � l'indice i du tableau plages
	public void ajouterDisponibilites(String participant, boolean[] disponibilites) {
		if (disponibilites.length != plages.length)
			throw new IllegalArgumentException();
		//a compl�ter
		for(int i=0; i< plages.length;i++){
			if(disponibilites[i])
				plages[i].setNbParticipantPresent(plages[i].getNbParticipantPresent()+1);
		}
		disponibilitess.put(participant, disponibilites);
	}
	
	// Hypoth�se: la PlageHoraire plage en param�tre fait bien partie du tableau plages
	// renvoie vrai si le participant est disponible pour cette plage horaire
	// renvoie faux si le participant n'est pas disponible ou s'il n'a pas rempli le
	// sondage doodle
	public boolean estDisponible(String participant, PlageHoraire plage) {
		int indice=0;
		for(PlageHoraire p : plages){
			if(p==plage)
				break;
			indice++;
		}
		if(disponibilitess.get(participant)==null)
			return false;
        return disponibilitess.get(participant)[indice];
    }

	// renvoie une des plages horaires qui a le maximum de participants pr�vus
	// cette m�thode est appel�e apr�s que les participants aient rempli leurs disponibilit�s
	public PlageHoraire trouverPlageQuiConvientLeMieux() {
		int indice=0;
		int max=0;
		int indicemax=0;

		for(PlageHoraire p : plages){
			if(p.getNbParticipantPresent()>max){
				max=p.getNbParticipantPresent();
				indicemax=indice;
			}
			indice++;
		}

		return plages[indicemax];
	}

}
