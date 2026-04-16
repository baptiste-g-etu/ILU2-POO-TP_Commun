package model;

public class ReservationRestaurant extends Reservation{
	private int numeroService;
	private int numeroTable;
	
	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}
	
	
	@Override
	public String toString() {
		String numeroServiceStr;
		if(numeroService == 1) {
			numeroServiceStr = "premier";
		}else {
			numeroServiceStr = "deuxième";
		}
		return String.format("Le %d/%d\nTable %d pour le %s service.", 
				super.jour, super.mois, numeroTable, numeroServiceStr);
	}
}
