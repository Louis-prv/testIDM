package testIDM;
import java.util.ArrayList;
import java.util.Collection;

public class RaceResults {
	
	String tagNumber;
	TimeDuration resultTime;
	ArrayList<RaceResults> results =  new ArrayList<RaceResults>();
	
	public RaceResults(String tagNumber, TimeDuration resultTime) {
		
		this.tagNumber = tagNumber;
		this.resultTime = resultTime;
		
	}
	
	void onNewResult( String tagNumber, TimeDuration resultTime) {
		
		results.add(new RaceResults(tagNumber, resultTime));
		
	}
	
	void printResults() {
		
		int cptr = 0;
		
		//Le but ici �tait de trier mon ArrayList en fonction de la valeur de TimeDuration pour avoir le classement final
		
		for (RaceResults i : results) {
			cptr++; 
			System.out.println("#"+cptr + " : " + i.tagNumber + " : " + i.resultTime);	
		}
		
	}
	
	//Je trouve une erreur ici qui m'a malheureusement bloqu�(sur la methode onNewResult , � l'appel.)
	// le but �tait de cr�er des temps d'arriv�e avec des tags RFID d�finit, pui affich� le classement avec printResults.
	public void main(String[] args) {
		onNewResult("H2458", 7458 );
		onNewResult("F1547", 7897 );
		onNewResult("H7852", 7225 );
		onNewResult("H1247", 7400 );
		onNewResult("F7336", 7489 );
		
		printResults();
		
		

	}

}
