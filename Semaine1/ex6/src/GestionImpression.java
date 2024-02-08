import java.util.*;

public class GestionImpression {
	
	private Queue<Impression> queue= new LinkedList<>();

	public void ajouterImpression(Impression impr){
		if(!queue.isEmpty()) {
			if (((LinkedList<Impression>) queue).getLast() == impr)
				((LinkedList<Impression>) queue).removeLast();
		}
		queue.offer(impr);
	}
	
	public Impression selectionnerImpression(){
		return queue.poll();
	}


}
