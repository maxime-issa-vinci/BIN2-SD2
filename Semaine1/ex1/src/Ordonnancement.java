import java.util.HashMap;
import java.util.LinkedList;

public class Ordonnancement {
	public static final int NIVEAU_PRIORITE_MAX=5;
	private HashMap<Integer, LinkedList<Tache>> mapPriorite = new HashMap<>();

//     
	public Ordonnancement(){

	}
	public void ajouterTache (String descriptif, int priorite){
		if(mapPriorite.get(priorite)==null){
			LinkedList list = new LinkedList<>();
			list.add(new Tache(descriptif, priorite));
			mapPriorite.put(priorite, list);
		} else{
			mapPriorite.get(priorite).add(new Tache(descriptif, priorite));

		}
	}
	
	//renvoie la tache prioritaire
	//renvoie null si plus de tache presente
	public Tache attribuerTache(){
		for (int i = NIVEAU_PRIORITE_MAX; i >= 1; i--) {
			LinkedList<Tache> taches = mapPriorite.get(i);
			if (taches != null && !taches.isEmpty()) {
				return taches.poll(); // Retire et renvoie la première tâche de la liste
			}
		}
		return null; // Retourne null si aucune tâche n'est trouvée
	}

}
