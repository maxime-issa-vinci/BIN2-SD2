import java.util.HashMap;
import java.util.HashSet;

public class ControleDAcces {

	private HashMap<Badge, Employe> map = new HashMap<>();
	private HashSet<Employe> set = new HashSet<>();
	public ControleDAcces(){
		
	}
	
	// associe le badge � un employ�
	public void donnerBadge (Badge b, Employe e){
		map.put(b,e);
	}
	
	// met � jour les employ�s pr�sents dans le batiment
	public void entrerBatiment (Badge b){
		set.add(map.get(b));
	}

	// met � jour les employ�s pr�sents dans le batiment
	public void sortirBatiment (Badge b){
		set.remove(map.get(b));
	}
	
	// renvoie vrai si l'employ� est dans le batiment, faux sinon
	public boolean estDansBatiment (Employe e){
		return set.contains(e);
	}

}
